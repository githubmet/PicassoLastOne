package hikmetanil.picassolastone.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

public class P012View extends View {

    Context context;
    Bitmap sourceBitmap;
    Bitmap destBitmap;
    String modeV;

    public P012View(Context context, Bitmap sourceBitmap, Bitmap destBitmap,String modeV) {
        super(context);
        this.context = context;
        this.sourceBitmap = sourceBitmap;
        this.destBitmap = destBitmap;
        this.modeV=modeV;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(modeV=="SRC_IN") {
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="SRC_OUT"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.SRC_OUT;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="SRC_OVER"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.SRC_OVER;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }

    }
}