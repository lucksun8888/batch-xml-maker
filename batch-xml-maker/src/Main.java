import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		// System.out.print("���������ļ�����");
		// Scanner sc = new Scanner(System.in);
		// String name = sc.next();
		HashMap kv = new HashMap();
		kv.put("Daytona USA 93 Edition", "����������93��");
		kv.put("Daytona USA GTX2004", "��������GTX2004");
		kv.put("Daytona USA To The Maxx", "Daytona USA��Maxx");
		kv.put("Daytona USA Saturn ADS", "�������������ǹ�湫˾");
		kv.put("Daytona USA Special Edition", "�����������ر��");
		kv.put("Daytona USA Turbo", "��������������");
		kv.put("Desert Tank", "ɳĮ̹��");
		kv.put("Dynamite Baseball 97 REV A", "ըҩ����97 REV A");
		kv.put("Dynamite Cop 2 Model 2B", "ըҩCop 2�ͺ�2B");
		kv.put("Dynamite Cop 2 Model 2A", "ըҩCop 2 2A��");
		kv.put("Dynamite Cop Model 2B", "2B��ըҩCop");
		kv.put("Dynamite Cop Model 2C", "2C��ըҩCop");
		kv.put("Fighting Vipers", "��֮��");
		kv.put("House of the Dead", "����֮��");
		kv.put("Indianapolis 500 Rev A, Twin, Never rev", "ӡ�ڰ��ɲ���˹500���A��˫�ˣ��Ӳ����");
		kv.put("Indianapolis 500 Rev A, Deluxe", "ӡ�ڰ��ɲ���˹500 A�������");
		kv.put("Indianapolis 500 Rev A, Twin, Older rev", "ӡ�ڰ��ɲ���˹500�汾A��˫�����ɰ汾");
		kv.put("Last Bronx Export, Rev A", "�ϴβ��ʿ�˹���ڣ��汾A");
		kv.put("Last Bronx Export, Japan Rev A", "�ϴβ��ʿ�˹���ڣ��ձ��汾A");
		kv.put("Last Bronx, USA Rev A", "����ʿ�˹�������汾A");
		kv.put("ManxTT Superbike Rev C, Deluxe", "ManxTT������C�泬��Ħ�г�");
		kv.put("ManxTT Superbike Rev C, Twin", "ManxTT����Ħ�г�C�棬˫��");
		kv.put("Motor Raid", "Raid����");
		kv.put("Over Rev Model 2A", "����Rev�ͺ�2A");
		kv.put("Over Rev Model 2B", "��ת��2B��");
		kv.put("Sonic Championship", "���ٽ�����");
		kv.put("Sega Water Ski", "���λ�ˮͧ");
		kv.put("Sonic The Fighters", "����ս������");
		kv.put("Sega Ski Super G", "���λ�ѩ����G");
		kv.put("Sega Rally Championship", "��������������");
		kv.put("Sega Rally Championship Rev B", "��������������B��");
		kv.put("Sega Rally Championship Pro Drivin", "��������������ְҵ����");
		kv.put("Sega Touring Championship", "����Ѳ����");
		kv.put("Sega Touring Championship Rev A", "����Ѳ����A��");
		kv.put("Sega Touring Championship Rev B", "����Ѳ����B��");
		kv.put("Top Skater", "���˰");
		kv.put("Top Skater USA", "�������˰��");
		kv.put("Virtual Cop", "���⾯��");
		kv.put("Virtual Cop 2", "���⾯��2");
		kv.put("Virtual Cop Rev A", "����ͨ����սͼ�޶���A");
		kv.put("Virtua Fighter 2.1", "����ս����2.1");
		kv.put("Virtua Fighter 2 Rev A", "����ս����2Rev A");
		kv.put("Virtua Fighter 2 Rev B", "����ս����2Rev B");
		kv.put("Virtua Fighter 2", "����ս����2");
		kv.put("Virtual On Cybertroopers Japan", "�ձ�����ʿ������������");
		kv.put("Virtua Striker Rev A", "����ǰ��A��");
		kv.put("Virtua Striker", "����ǰ�档");
		kv.put("Wave Runner", "������");
		kv.put("Zero Gunner", "�����֡�");
		kv.put("Zero Gunner Japan Model 2A", "�����ձ�2A��");
		kv.put("Zero Gunner Japan", "�����ձ�");
		kv.put("Daytona USA Turbo Rev A", "����������������ѹ��A��");
		kv.put("Pilot Kids Model 2A", "����Ա��ͯģ��2A");
		kv.put("Super GT 24h", "����ȼ���ֻ�24Сʱ");
		kv.put("Sky Target", "����Ŀ��");
		kv.put("Top Skater Japan", "�ձ����˰��");
		kv.put("Rail Chase 2", "�����2");
		kv.put("Zero Gunner Model 2A", "����2A��");
		kv.put("Dead or Live Model 2A", "���Ļ��ǻ��2A��");
		kv.put("Daytona USA", "��������");
		kv.put("Dynamite Cop Model 2A", "ըҩCop�ͺ�2A");
		kv.put("Behind Enemy Lines", "�к�");
		kv.put("Virtual On Cybertroopers US", "�������粿��");
		kv.put("Pilol Kids Model 2B", "2B�ͱ���ҩ");
		kv.put("Dead or Live Model 2B", "�����ģʽ2B");
		kv.put("Gunblade NY", "��ǹ��");

		String xmlPath = "D:/shz/workspace/batch-xml-maker/model/model2.xml";
		Xmlreader xd = new Xmlreader(xmlPath, kv);
		// ����map��������name��ֵ������

	}
}
