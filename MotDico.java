package tp3;

public class MotDico {
	static int num=0;
	private String mot;
	private String definition;
	public MotDico(String mot, String definition) {
        this.num ++;
        this.mot = mot;
        this.definition = definition;
    }
	public String getMot()
	{
		return this.mot;
	}
	public String getDefinition()
	{
		return this.definition;
	}
	public void setDefinition(String s)
	{
		  this.definition=s;
	}
	public void setMot(String s)
	{
		this.mot=s;
	}
	public boolean synonyme(MotDico m)
	{
		if(getDefinition()==m.definition)
			return true;
		else
			return false;
	}
	   
}
