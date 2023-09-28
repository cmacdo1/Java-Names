
public class Name
{
	// attributes
	private String first;
	private String middle;
	private String last;
	
	// constructor
	public Name ( String first, String middle, String last)
	{
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	
	// behaviors
	public String firstMiddleLast()
	{
		return first + " " + middle + " " + last;
	}
	
	public String lastFirstMiddle()
	{
		return last + ", " + first + " " + middle;
	}
	
	public boolean equals(Name otherName)
	{
		if( this.first.equalsIgnoreCase(otherName.first) 
				&& this.middle.equalsIgnoreCase(otherName.middle) 
				&& this.last.equalsIgnoreCase(otherName.last))
			return true;
		else
			return false;
	}
	
	public String initials()
	{
		String initials = first.substring(0, 1) + middle.substring(0, 1)
			+ last.substring(0, 1);
		return initials.toUpperCase();
	}
	
	public int length()
	{
		String fullName = first + middle + last;
		return fullName.length();
	}
	
	// getter and setters
	public String getFirst()
	{
		return first;
	}
	
	public String getMiddle()
	{
		return middle;
	}
	
	public String getLast()
	{
		return last;
	}
}
