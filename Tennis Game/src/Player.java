
public class Player
	{
	String Name;
	double Serve;
	double Sreturn;
	double Groundstroke;
	double Greturn;
	double Slice;
	double lreturn;
	double BreakPoint;
	String description;
 Player(String n, double s, double sr, double g, double gr, double l, double lr, double b, String d)
		{
		Name = n;
		Serve = s;
		Sreturn = sr;
		Groundstroke = g;
		Greturn = gr;
		Slice = l;
		lreturn = lr;
		BreakPoint = b;
		description = d;
		}
public String getName()
	{
	return Name;
	}
public void setName(String name)
	{
	Name = name;
	}
public double getServe()
	{
	return Serve;
	}
public void setServe(double serve)
	{
	Serve = serve;
	}
public double getGroundstroke()
	{
	return Groundstroke;
	}
public void setGroundstroke(double groundstroke)
	{
	Groundstroke = groundstroke;
	}
public double getSlice()
	{
	return Slice;
	}
public void setSlice(double slice)
	{
	Slice = slice;
	}
public double getBreakPoint()
	{
	return BreakPoint;
	}
public void setBreakPoint(double breakPoint)
	{
	BreakPoint = breakPoint;
	}
public double getSreturn()
	{
	return Sreturn;
	}
public void setSreturn(double sreturn)
	{
	Sreturn = sreturn;
	}
public double getGreturn()
	{
	return Greturn;
	}
public void setGreturn(double greturn)
	{
	Greturn = greturn;
	}
public double getLreturn()
	{
	return lreturn;
	}
public void setLreturn(double lreturn)
	{
	this.lreturn = lreturn;
	}
public String getDescription()
	{
	return description;
	}
public void setDescription(String description)
	{
	this.description = description;
	}
	}
	
