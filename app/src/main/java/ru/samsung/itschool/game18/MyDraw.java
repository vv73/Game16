package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View{

	Object[] f = new Object[100];
	public MyDraw(Context context) {
		super(context);
		f[0] = new Square(50, 30);
		f[1] = new Circle(40, 100);
		f[2] = new Pic(BitmapFactory.decodeResource
				(getResources(), R.drawable.ic_launcher));
	}
	Paint paint = new Paint();
	@Override
	protected void onDraw(Canvas canvas) {
		for (Object fig : f)
		{
			if (fig != null){
				if (fig instanceof Drawable) ((Drawable)fig).draw(canvas);
				if (fig instanceof Figure)((Figure)fig).move();
			}
		}
		invalidate();
	}
	
	

}
