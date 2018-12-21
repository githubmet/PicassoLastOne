package hikmetanil.picassolastone.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.squareup.picasso.Transformation;

public class P005Transform implements Transformation {
    @Override
    public Bitmap transform(Bitmap source) {

        Canvas canvas=new Canvas(source);
        Paint paint=new Paint();
        paint.setTextSize(25f);
        paint.setARGB(255,0,255,0);

        canvas.drawText("Hello Canvas",0,400,paint);
        return source;
    }

    @Override
    public String key() {
        return "deneme";
    }
}
