class Mobile
{
	boolean key;
	// boolean playGame;
	// boolean watchReels;
	public void playGame(boolean key)
	{
		this.key = key;
		if(key==true)
			System.out.println("\033[91mWelcome to Varun Game\033[0m");
		else
			System.out.println("\033[92mGame will not start\033[0m");
	}
	public void watchReels(boolean key)
	{
		this.key = key;
		if(key==true)
			System.out.println("\033[91mBro Watch to Reels\033[0m");
		else
			System.out.println("\033[92mBro Reels will not start\033[0m");
			// System.out.println("Game will not started");
	}
}