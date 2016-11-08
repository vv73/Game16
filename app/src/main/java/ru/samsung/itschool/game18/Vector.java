package ru.samsung.itschool.game18;

public class Vector {
    float x, y;
    public void print()
    {
    	System.out.println("(" + x + ", " + y + ")");
    }
    
    public String toString()
    {
    	return "(" + x + "; " + y + ")";
    }
    
    public void sum(Vector v)
    {
    	this.x += v.x;
    	this.y += v.y;
    }
    
    public void mul(float k)
    {
    	x *= k;
    	y *= k;
    }
    
    void set(float x, float y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    public Vector()
    {
    	x = 0;
    	y = 0;
    }
    
    public Vector(float x, float y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    
    static Vector v;
	public static void main(String argS[]) {    
          System.out.println(v);
	}
}
