package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View{

	Figure[] f = new Figure[100];
	public MyDraw(Context context) {
		super(context);
		f[0] = new Square(50, 30);
		f[1] = new Circle(40, 100);
	}
	Paint paint = new Paint();
	@Override
	protected void onDraw(Canvas canvas) {
		for (Figure fig : f)
		{
			if (fig != null){
				fig.draw(canvas);
				fig.move();
			}
		}
		invalidate();
	}
	
	

}
