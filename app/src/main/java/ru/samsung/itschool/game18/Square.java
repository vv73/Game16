package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Square extends Figure{
    int size = 100;
    public Square(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    void draw(Canvas canvas) {
        canvas.drawRect(pos.x, pos.y, pos.x + size, pos.y + size, paint);
    }
}
