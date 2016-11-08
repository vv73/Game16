package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View{

	Vector v;
	Square s;
	public MyDraw(Context context) {
		super(context);
		v = new Vector (100, 200);
		s = new Square (200, 150);
	}

	Paint paint = new Paint();
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawLine(0, 0, v.x, v.y, paint);
		canvas.drawText(v.toString(), 50, 50, paint);
		s.draw(canvas);
		s.move();
		invalidate();
	}
	
	

}
