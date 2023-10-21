
public class HangManMain {

	public static void main(String[] args) {
		
		//Get a random String as the solution
		String solution = randomString();
		
		//create underscores for the solution
		String underscore = "";
		for (int i = 0 ; i < solution.length(); i++) {
			underscore += "_ ";
		}
		
		//set up StringBuilder so you can change individual characters
		StringBuilder answers = new StringBuilder(underscore);
		//For example, if the user guessed the letter 'a', and you
		//found 'a' at index 3 in solution. You can do:
		//answers.setCharAt(3 * 2, 'a'); to replace the underscore to the letter 'a'
		//notice the multiply by 2, because for each letter in solution
		//there is an underscore and a space.
				
		
		System.out.println("Hangman Begins! You have 7 guesses");
		System.out.println(answers);
		
		
	}
	
	
	public static  String randomString() {
		String dictionary = "the unanimous declaration of the thirteen united states of america, when in the course of human events, it becomes necessary for one people to dissolve the political bands which have connected them with another, and to assume among the powers of the earth, the separate and equal station to which the laws of nature and of nature's god entitle them, a decent respect to the opinions of mankind requires that they should declare the causes which impel them to the separation.\r\n"
				+ "\r\n"
				+ "we hold these truths to be self-evident, that all men are created equal, that they are endowed by their creator with certain unalienable rights, that among these are life, liberty and the pursuit of happiness.--that to secure these rights, governments are instituted among men, deriving their just powers from the consent of the governed, --that whenever any form of government becomes destructive of these ends, it is the right of the people to alter or to abolish it, and to institute new government, laying its foundation on such principles and organizing its powers in such form, as to them shall seem most likely to effect their safety and happiness. prudence, indeed, will dictate that governments long established should not be changed for light and transient causes; and accordingly all experience hath shewn, that mankind are more disposed to suffer, while evils are sufferable, than to right themselves by abolishing the forms to which they are accustomed. but when a long train of abuses and usurpations, pursuing invariably the same object evinces a design to reduce them under absolute despotism, it is their right, it is their duty, to throw off such government, and to provide new guards for their future security.--such has been the patient sufferance of these colonies; and such is now the necessity which constrains them to alter their former systems of government. the history of the present king of great britain is a history of repeated injuries and usurpations, all having in direct object the establishment of an absolute tyranny over these states. to prove this, let facts be submitted to a candid world.\r\n"
				+ "\r\n"
				+ "he has refused his assent to laws, the most wholesome and necessary for the public good.\r\n"
				+ "\r\n"
				+ "he has forbidden his governors to pass laws of immediate and pressing importance, unless suspended in their operation till his assent should be obtained; and when so suspended, he has utterly neglected to attend to them.\r\n"
				+ "\r\n"
				+ "he has refused to pass other laws for the accommodation of large districts of people, unless those people would relinquish the right of representation in the legislature, a right inestimable to them and formidable to tyrants only.\r\n"
				+ "\r\n"
				+ "he has called together legislative bodies at places unusual, uncomfortable, and distant from the depository of their public records, for the sole purpose of fatiguing them into compliance with his measures.\r\n"
				+ "\r\n"
				+ "he has dissolved representative houses repeatedly, for opposing with manly firmness his invasions on the rights of the people.\r\n"
				+ "\r\n"
				+ "he has refused for a long time, after such dissolutions, to cause others to be elected; whereby the legislative powers, incapable of annihilation, have returned to the people at large for their exercise; the state remaining in the mean time exposed to all the dangers of invasion from without, and convulsions within.\r\n"
				+ "\r\n"
				+ "he has endeavoured to prevent the population of these states; for that purpose obstructing the laws for naturalization of foreigners; refusing to pass others to encourage their migrations hither, and raising the conditions of new appropriations of lands.\r\n"
				+ "\r\n"
				+ "he has obstructed the administration of justice, by refusing his assent to laws for establishing judiciary powers.\r\n"
				+ "\r\n"
				+ "he has made judges dependent on his will alone, for the tenure of their offices, and the amount and payment of their salaries.\r\n"
				+ "\r\n"
				+ "he has erected a multitude of new offices, and sent hither swarms of officers to harrass our people, and eat out their substance.\r\n"
				+ "\r\n"
				+ "he has kept among us, in times of peace, standing armies without the consent of our legislatures.\r\n"
				+ "\r\n"
				+ "he has affected to render the military independent of and superior to the civil power.\r\n"
				+ "\r\n"
				+ "he has combined with others to subject us to a jurisdiction foreign to our constitution, and unacknowledged by our laws; giving his assent to their acts of pretended legislation:\r\n"
				+ "\r\n"
				+ "for quartering large bodies of armed troops among us:\r\n"
				+ "\r\n"
				+ "for protecting them, by a mock trial, from punishment for any murders which they should commit on the inhabitants of these states:\r\n"
				+ "\r\n"
				+ "for cutting off our trade with all parts of the world:\r\n"
				+ "\r\n"
				+ "for imposing taxes on us without our consent:\r\n"
				+ "\r\n"
				+ "for depriving us in many cases, of the benefits of trial by jury:\r\n"
				+ "\r\n"
				+ "for transporting us beyond seas to be tried for pretended offences\r\n"
				+ "\r\n"
				+ "for abolishing the free system of english laws in a neighbouring province, establishing therein an arbitrary government, and enlarging its boundaries so as to render it at once an example and fit instrument for introducing the same absolute rule into these colonies:\r\n"
				+ "\r\n"
				+ "for taking away our charters, abolishing our most valuable laws, and altering fundamentally the forms of our governments:\r\n"
				+ "\r\n"
				+ "for suspending our own legislatures, and declaring themselves invested with power to legislate for us in all cases whatsoever.\r\n"
				+ "\r\n"
				+ "he has abdicated government here, by declaring us out of his protection and waging war against us.\r\n"
				+ "\r\n"
				+ "he has plundered our seas, ravaged our coasts, burnt our towns, and destroyed the lives of our people.\r\n"
				+ "\r\n"
				+ "he is at this time transporting large armies of foreign mercenaries to compleat the works of death, desolation and tyranny, already begun with circumstances of cruelty & perfidy scarcely paralleled in the most barbarous ages, and totally unworthy the head of a civilized nation.\r\n"
				+ "\r\n"
				+ "he has constrained our fellow citizens taken captive on the high seas to bear arms against their country, to become the executioners of their friends and brethren, or to fall themselves by their hands.\r\n"
				+ "\r\n"
				+ "he has excited domestic insurrections amongst us, and has endeavoured to bring on the inhabitants of our frontiers, the merciless indian savages, whose known rule of warfare, is an undistinguished destruction of all ages, sexes and conditions.\r\n"
				+ "\r\n"
				+ "in every stage of these oppressions we have petitioned for redress in the most humble terms: our repeated petitions have been answered only by repeated injury. a prince whose character is thus marked by every act which may define a tyrant, is unfit to be the ruler of a free people.\r\n"
				+ "\r\n"
				+ "nor have we been wanting in attentions to our brittish brethren. we have warned them from time to time of attempts by their legislature to extend an unwarrantable jurisdiction over us. we have reminded them of the circumstances of our emigration and settlement here. we have appealed to their native justice and magnanimity, and we have conjured them by the ties of our common kindred to disavow these usurpations, which, would inevitably interrupt our connections and correspondence. they too have been deaf to the voice of justice and of consanguinity. we must, therefore, acquiesce in the necessity, which denounces our separation, and hold them, as we hold the rest of mankind, enemies in war, in peace friends.\r\n"
				+ "\r\n"
				+ "we, therefore, the representatives of the united states of america, in general congress, assembled, appealing to the supreme judge of the world for the rectitude of our intentions, do, in the name, and by authority of the good people of these colonies, solemnly publish and declare, that these united colonies are, and of right ought to be free and independent states; that they are absolved from all allegiance to the british crown, and that all political connection between them and the state of great britain, is and ought to be totally dissolved; and that as free and independent states, they have full power to levy war, conclude peace, contract alliances, establish commerce, and to do all other acts and things which independent states may of right do. and for the support of this declaration, with a firm reliance on the protection of divine providence, we mutually pledge to each other our lives, our fortunes and our sacred honor.";
	
		String[] tokens = dictionary.split("[,. \r\n!?:]");
		
		int rand = (int)(Math.random()*tokens.length);
		
		while (tokens[rand].length() <= 4) {
			rand = (int)(Math.random()*tokens.length);
		}
		
		return tokens[rand];
		
	
	}

}
