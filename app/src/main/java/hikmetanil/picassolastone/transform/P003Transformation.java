package hikmetanil.picassolastone.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.squareup.picasso.Transformation;

public class P003Transformation implements Transformation {

    @Override
    public Bitmap transform(Bitmap source) {
        Canvas canvas=new Canvas(source);
        Paint paint=new Paint();
        paint.setColor(Color.RED);
        canvas.drawRect(0,0,100,100,paint);
        return source;
    }
    @Override
    public String key() {
        return "deneme";
    }
}
