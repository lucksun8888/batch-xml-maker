import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


/**
 * ���������ļ�����ȡ�ڵ���Ϣ
 * 
 * @author lucksun
 *
 */
public class Xmlreader {
	HashMap<String, Serializable> nodeMap = new HashMap<String, Serializable>();
	HashMap KV = new HashMap();

	public Xmlreader(String filename, HashMap kv) throws Exception {
		KV= kv;
		parserXml(filename);
		
	}

	public int getLength() {
		return nodeMap.size();
	}

	public void parserXml(String fileName) throws IOException {
		try {
			File f = new File(fileName);
			InputStream in = new FileInputStream(f);
			SAXReader reader = new SAXReader();
			Document doc = reader.read(in);
			Element root = doc.getRootElement();
			writeNode(root);
			rename(doc,fileName);
			System.out.println(nodeMap);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void readNode(Element root, HashMap<String, Serializable> map) {
		if (root == null)
			return;
		// ��ȡ����
		if (root.getData() != null && !"".equals(root.getData().toString().trim())) {
			map.put(root.getName(), (String) root.getData());
		}  
		
		// ��ȡ�����ӽڵ�
		List<Element> childNodes = root.elements();
		if(childNodes.size()>0)
		{
			HashMap<String, Serializable> m = new HashMap<String, Serializable>();
			map.put(root.getName(), m);
			for (Element e : childNodes) {
				readNode(e, m);
			}
		}		
	}

	public void writeNode(Element root) {
		if (root == null)
			return;
		// ����kv������չ�ϵ�޸�����
		if(root.getName().equalsIgnoreCase("name")){
			if(root.getStringValue()==null || root.getStringValue()==""){
				
			}else{
				root.setText((String) KV.get(root.getStringValue()));	
			}
			
		}
		
		// ��ȡ�����ӽڵ�
		List<Element> childNodes = root.elements();
		if(childNodes.size()>0)
		{
			for (Element e : childNodes) {
				writeNode(e);
			}
		}		
	}
	
	public HashMap<String, Serializable> getMap() {
		return nodeMap;
	}
	
	/**
	 * �޸�����
	 * @param fileName 
	 * @param kv 
	 * @param key
	 * @param value
	 * @throws IOException 
	 */
	public void rename( Document doc, String fileName) throws IOException{

	    /*�����ֽ������*/
	    FileOutputStream out = new FileOutputStream(fileName);
	    /*�����ʽ����*/
	    OutputFormat format = OutputFormat.createPrettyPrint();
	    format.setEncoding("GBK");
	    /*����xml�������*/
	    XMLWriter xmlWriter = new XMLWriter(out, format);
	    /*��dom������뵽xml���������*/
	    xmlWriter.write(doc);
	    /*ˢ�¹ر�*/
	    xmlWriter.close();
	}
	
	
}
