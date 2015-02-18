
import java.util.Random;
import java.util.Scanner;

public class generator {

	static Scanner sc = new Scanner(System.in);
	static Random rnd = new Random();
	
	public static void main(String[] args){
		String pose = "Would you like to hear a Shakespearean insult?";
		System.out.println(pose);
		System.out.println("1. Yes");
		System.out.println("2. No");
		int answer = sc.nextInt();

		while(answer == 1){
			System.out.println("Thou " + listOne() + " " + listTwo() + " " + listThree() + ".");
			pose = "Would you like to hear another one?";
			System.out.println(pose);
			System.out.println("1. Yes");
			System.out.println("2. No");
			answer = sc.nextInt();
		}
		if(answer == 2){
			System.out.println("Okay, whatever.");
		}

		while(answer != 1 && answer != 2){
			System.out.println("That's not 1 or 2. Please try again.");
			System.out.println(pose);
			System.out.println("1. Yes");
			System.out.println("2. No");
			answer = sc.nextInt();
		}

	}
	public static String listOne(){
		String[] anArray;
		anArray = new String[50];
		anArray[0] = "artless";
		anArray[1] = "bawdy";
		anArray[2] = "beslubbering";
		anArray[3] = "bootless";
		anArray[4] = "churlish";
		anArray[5] = "cockered";
		anArray[6] = "clouted";
		anArray[7] = "craven";
		anArray[8] = "currish";
		anArray[9] = "dankish";
		anArray[10] = "dissembling";
		anArray[11] = "droning";
		anArray[12] = "errant";
		anArray[13] = "fawning";
		anArray[14] = "fobbing";
		anArray[15] = "froward";
		anArray[16] = "frothy";
		anArray[17] = "gleeking";
		anArray[18] = "goatish";
		anArray[19] = "gorbellied";
		anArray[20] = "impertinent";
		anArray[21] = "infectious";
		anArray[22] = "jarring";
		anArray[23] = "loggerheaded";
		anArray[24] = "lumpish";
		anArray[25] = "mammering";
		anArray[26] = "mangled";
		anArray[27] = "mewling";
		anArray[28] = "paunchy";
		anArray[29] = "pribbling";
		anArray[30] = "puking";
		anArray[31] = "puny";
		anArray[32] = "qualling";
		anArray[33] = "rank";
		anArray[34] = "reeky";
		anArray[35] = "roguish";
		anArray[36] = "ruttish";
		anArray[37] = "saucy";
		anArray[38] = "spleeny";
		anArray[39] = "spongy";
		anArray[40] = "surly";
		anArray[41] = "tottering";
		anArray[42] = "unmuzzled";
		anArray[43] = "vain";
		anArray[44] = "venomed";
		anArray[45] = "villainous";
		anArray[46] = "warped";
		anArray[47] = "wayward";
		anArray[48] = "weedy";
		anArray[49] = "yeasty";
		
		return anArray[rnd.nextInt(50)];
		
	}
	
	public static String listTwo(){
		String[] anArray;
		anArray = new String[50];
		anArray[0] = "base-court";
		anArray[1] = "bat-fowling";
		anArray[2] = "beef-witted";
		anArray[3] = "boil-brained";
		anArray[4] = "clapper-clawed";
		anArray[5] = "clay-brained";
		anArray[6] = "common-kissing";
		anArray[7] = "crook-pated";
		anArray[8] = "dismal-dreaming";
		anArray[9] = "dizzy-eyed";
		anArray[10] = "doghearted";
		anArray[11] = "dread-bolted";
		anArray[12] = "earth-vexing";
		anArray[13] = "elf-skinned";
		anArray[14] = "fat-kidneyed";
		anArray[15] = "fen-sucked";
		anArray[16] = "flap-mouthed";
		anArray[17] = "fly-bitten";
		anArray[18] = "folly-fallen";
		anArray[19] = "fool-born";
		anArray[20] = "full-gorged";
		anArray[21] = "guts-griping";
		anArray[22] = "half-faced";
		anArray[23] = "hasty-witted";
		anArray[24] = "hedge-born";
		anArray[25] = "hell-hated";
		anArray[26] = "idle-headed";
		anArray[27] = "ill-breeding";
		anArray[28] = "ill-nurtured";
		anArray[29] = "knotty-pated";
		anArray[30] = "milk-livered";
		anArray[31] = "motley-minded";
		anArray[32] = "onion-eyed";
		anArray[33] = "plume-plucked";
		anArray[34] = "pottle-deep";
		anArray[35] = "pox-marked";
		anArray[36] = "reeling-ripe";
		anArray[37] = "rough-hewn";
		anArray[38] = "rude-growing";
		anArray[39] = "rump-fed";
		anArray[40] = "shard-borne";
		anArray[41] = "sheep-biting";
		anArray[42] = "spur-galled";
		anArray[43] = "swag-bellied";
		anArray[44] = "tardy-gaited";
		anArray[45] = "tickle-brained";
		anArray[46] = "toad-spotted";
		anArray[47] = "unchinsnouted";
		anArray[48] = "weather-bitten";
		anArray[49] = "beetle-headed";
		
		return anArray[rnd.nextInt(50)];
		
	}
	
	public static String listThree(){
		String[] anArray = new String[50];
		anArray[0] = "apple-john";
		anArray[1] = "baggage";
		anArray[2] = "barnacle";
		anArray[3] = "bladder";
		anArray[4] = "boar-pig";
		anArray[5] = "bugbear";
		anArray[6] = "bum-bailey";
		anArray[7] = "canker-blossom";
		anArray[8] = "clack-dish";
		anArray[9] = "clotpole";
		anArray[10] = "coxcomb";
		anArray[11] = "codpiece";
		anArray[12] = "death-token";
		anArray[13] = "dewberry";
		anArray[14] = "flap-dragon";
		anArray[15] = "flax-wench";
		anArray[16] = "flirt-gill";
		anArray[17] = "foot-licker";
		anArray[18] = "fustilarian";
		anArray[19] = "giglet";
		anArray[20] = "gudgeon";
		anArray[21] = "hagard";
		anArray[22] = "harpy";
		anArray[23] = "hedge-pig";
		anArray[24] = "horn-beast";
		anArray[25] = "hugger-mugger";
		anArray[26] = "joithead";
		anArray[27] = "lewdster";
		anArray[28] = "lout";
		anArray[29] = "maggot-pie";
		anArray[30] = "malt-worm";
		anArray[31] = "mammet";
		anArray[32] = "measle";
		anArray[33] = "minnow";
		anArray[34] = "miscreant";
		anArray[35] = "moldwarp";
		anArray[36] = "mumble-news";
		anArray[37] = "nut-hook";
		anArray[38] = "pigeon-egg";
		anArray[39] = "pignut";
		anArray[40] = "puttock";
		anArray[41] = "pumpion";
		anArray[42] = "ratsbane";
		anArray[43] = "scut";
		anArray[44] = "skainsmate";
		anArray[45] = "strumpet";
		anArray[46] = "varlot";
		anArray[47] = "vassal";
		anArray[48] = "whey-face";
		anArray[49] = "wagtail";
		
		return anArray[rnd.nextInt(50)];
		
	}
}
