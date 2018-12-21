package hikmetanil.picassolastone;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

import hikmetanil.picassolastone.view.P010View;
import hikmetanil.picassolastone.view.P011View;
import hikmetanil.picassolastone.view.P012View;
import hikmetanil.picassolastone.view.P013View;

public class P013MultOverScr extends Activity {
    ImageView imageViewLeftP013;
    ImageView imageViewRightP013;
    RelativeLayout relativeLayoutP013;
    RelativeLayout relativeLayout2P013;
    RelativeLayout relativeLayout3P013;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p013mult_over_scr);

        imageViewLeftP013= findViewById(R.id.imageViewLeftP013);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(200,200)
                .into(imageViewLeftP013);

        imageViewRightP013= findViewById(R.id.imageViewRightP013);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/agapanthus.jpg")
                .resize(200,200)
                .into(imageViewRightP013);

        relativeLayoutP013= findViewById(R.id.relativeLayoutP013);
        relativeLayout2P013= findViewById(R.id.relativeLayout2P013);
        relativeLayout3P013= findViewById(R.id.relativeLayout3P013);

    }

    public void onClickMtdP013(View view) {
        Drawable drawableSource= imageViewLeftP013.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP013.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayoutP013.addView(new P013View(this,bitmapSource,bitmapDest,"MULTIPLY"));
    }

    public void onClickMtd2P013(View view) {
        Drawable drawableSource= imageViewLeftP013.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP013.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout2P013.addView(new P013View(this,bitmapSource,bitmapDest,"OVERLAY"));
    }
    public void onClickMtd3P013(View view) {
        Drawable drawableSource= imageViewLeftP013.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP013.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout3P013.addView(new P013View(this,bitmapSource,bitmapDest,"SCREEN"));
    }
}
