package hikmetanil.picassolastone.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

public class P010View extends View {

    Context context;
    Bitmap sourceBitmap;
    Bitmap destBitmap;
    String modeV;

    public P010View(Context context, Bitmap sourceBitmap, Bitmap destBitmap,String modeV) {
        super(context);
        this.context = context;
        this.sourceBitmap = sourceBitmap;
        this.destBitmap = destBitmap;
        this.modeV=modeV;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(modeV=="LIGHTEN") {
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.LIGHTEN;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="DST"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.DST;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }
        else if(modeV=="DST_ATOP"){
            Paint paint = new Paint();
            canvas.drawBitmap(destBitmap, 50, 50, paint);

            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.DST_ATOP;
            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
            canvas.drawBitmap(sourceBitmap, 0, 0, paint);
        }

    }
}