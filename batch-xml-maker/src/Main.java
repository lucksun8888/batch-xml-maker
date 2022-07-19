import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		// System.out.print("输入配置文件名称");
		// Scanner sc = new Scanner(System.in);
		// String name = sc.next();
		HashMap kv = new HashMap();
		kv.put("Daytona USA 93 Edition", "美国代托纳93版");
		kv.put("Daytona USA GTX2004", "美国代顿GTX2004");
		kv.put("Daytona USA To The Maxx", "Daytona USA至Maxx");
		kv.put("Daytona USA Saturn ADS", "美国代托纳土星广告公司");
		kv.put("Daytona USA Special Edition", "代托纳美国特别版");
		kv.put("Daytona USA Turbo", "代托纳美国涡轮");
		kv.put("Desert Tank", "沙漠坦克");
		kv.put("Dynamite Baseball 97 REV A", "炸药棒球97 REV A");
		kv.put("Dynamite Cop 2 Model 2B", "炸药Cop 2型号2B");
		kv.put("Dynamite Cop 2 Model 2A", "炸药Cop 2 2A型");
		kv.put("Dynamite Cop Model 2B", "2B型炸药Cop");
		kv.put("Dynamite Cop Model 2C", "2C型炸药Cop");
		kv.put("Fighting Vipers", "格斗之蛇");
		kv.put("House of the Dead", "死者之家");
		kv.put("Indianapolis 500 Rev A, Twin, Never rev", "印第安纳波利斯500版次A，双人，从不版次");
		kv.put("Indianapolis 500 Rev A, Deluxe", "印第安纳波利斯500 A版豪华版");
		kv.put("Indianapolis 500 Rev A, Twin, Older rev", "印第安纳波利斯500版本A，双联，旧版本");
		kv.put("Last Bronx Export, Rev A", "上次布朗克斯出口，版本A");
		kv.put("Last Bronx Export, Japan Rev A", "上次布朗克斯出口，日本版本A");
		kv.put("Last Bronx, USA Rev A", "最后布朗克斯，美国版本A");
		kv.put("ManxTT Superbike Rev C, Deluxe", "ManxTT豪华版C版超级摩托车");
		kv.put("ManxTT Superbike Rev C, Twin", "ManxTT超级摩托车C版，双人");
		kv.put("Motor Raid", "Raid引擎");
		kv.put("Over Rev Model 2A", "关于Rev型号2A");
		kv.put("Over Rev Model 2B", "过转速2B型");
		kv.put("Sonic Championship", "音速锦标赛");
		kv.put("Sega Water Ski", "世嘉滑水艇");
		kv.put("Sonic The Fighters", "音速战斗机。");
		kv.put("Sega Ski Super G", "世嘉滑雪超级G");
		kv.put("Sega Rally Championship", "世嘉拉力竞标赛");
		kv.put("Sega Rally Championship Rev B", "世嘉拉力锦标赛B版");
		kv.put("Sega Rally Championship Pro Drivin", "世嘉拉力锦标赛职业车手");
		kv.put("Sega Touring Championship", "世嘉巡回赛");
		kv.put("Sega Touring Championship Rev A", "世嘉巡回赛A版");
		kv.put("Sega Touring Championship Rev B", "世嘉巡回赛B版");
		kv.put("Top Skater", "最高税");
		kv.put("Top Skater USA", "美国最高税收");
		kv.put("Virtual Cop", "虚拟警察");
		kv.put("Virtual Cop 2", "虚拟警察2");
		kv.put("Virtual Cop Rev A", "虚拟通用作战图修订版A");
		kv.put("Virtua Fighter 2.1", "虚拟战斗机2.1");
		kv.put("Virtua Fighter 2 Rev A", "虚拟战斗机2Rev A");
		kv.put("Virtua Fighter 2 Rev B", "虚拟战斗机2Rev B");
		kv.put("Virtua Fighter 2", "虚拟战斗机2");
		kv.put("Virtual On Cybertroopers Japan", "日本网络士兵的虚拟世界");
		kv.put("Virtua Striker Rev A", "虚拟前锋A版");
		kv.put("Virtua Striker", "虚拟前锋。");
		kv.put("Wave Runner", "御风者");
		kv.put("Zero Gunner", "零炮手。");
		kv.put("Zero Gunner Japan Model 2A", "零炮日本2A型");
		kv.put("Zero Gunner Japan", "零炮日本");
		kv.put("Daytona USA Turbo Rev A", "美国代托纳涡轮增压器A版");
		kv.put("Pilot Kids Model 2A", "飞行员儿童模型2A");
		kv.put("Super GT 24h", "超级燃气轮机24小时");
		kv.put("Sky Target", "空中目标");
		kv.put("Top Skater Japan", "日本最高税收");
		kv.put("Rail Chase 2", "轨道槽2");
		kv.put("Zero Gunner Model 2A", "零炮2A型");
		kv.put("Dead or Live Model 2A", "死的还是活的2A型");
		kv.put("Daytona USA", "梦游美国");
		kv.put("Dynamite Cop Model 2A", "炸药Cop型号2A");
		kv.put("Behind Enemy Lines", "敌后");
		kv.put("Virtual On Cybertroopers US", "虚拟网络部队");
		kv.put("Pilol Kids Model 2B", "2B型避孕药");
		kv.put("Dead or Live Model 2B", "死或活模式2B");
		kv.put("Gunblade NY", "新枪刃");

		String xmlPath = "D:/shz/workspace/batch-xml-maker/model/model2.xml";
		Xmlreader xd = new Xmlreader(xmlPath, kv);
		// 遍历map，将所有name赋值并保存

	}
}
