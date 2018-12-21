package hikmetanil.picassolastone.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

public class P014View extends View {

    Context context;
    Bitmap sourceBitmap;
    Bitmap destBitmap;
    String modeV;

    public P014View(Context context, Bitmap sourceBitmap, Bitmap destBitmap,String modeV) {
        super(context);
        this.context = context;
        this.sourceBitmap = sourceBitmap;
        this.destBitmap = destBitmap;
        this.modeV=modeV;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(modeV=="SRC") {
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.SRC;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="SRC_ATOP"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.SRC_ATOP;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="XOR"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.XOR;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }

    }
}