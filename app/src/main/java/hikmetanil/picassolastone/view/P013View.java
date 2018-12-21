package hikmetanil.picassolastone.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

public class P013View extends View {

    Context context;
    Bitmap sourceBitmap;
    Bitmap destBitmap;
    String modeV;

    public P013View(Context context, Bitmap sourceBitmap, Bitmap destBitmap,String modeV) {
        super(context);
        this.context = context;
        this.sourceBitmap = sourceBitmap;
        this.destBitmap = destBitmap;
        this.modeV=modeV;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(modeV=="MULTIPLY") {
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.MULTIPLY;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="OVERLAY"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.OVERLAY;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="SCREEN"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.SCREEN;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }

    }
}