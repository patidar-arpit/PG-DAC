package tester;

public class BoxArray {
	
	private int length;
	private int breadth;
	private int depth;
	public BoxArray(int length,int breadth,int depth)
	{
		this.length=length;
		this.breadth=breadth;
		this.depth=depth;
						
    }
	
	public int getVolume()
	{
		int vol=length*breadth*depth;
		return vol;
	}
	
	public int getBreadth()
	{
		return this.breadth;
	}
	
	public void setBreadth(int bd)
	{
		this.breadth=bd;
		//return bd;
	}
	

}
