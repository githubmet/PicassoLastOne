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

public class P011DstInOutOver extends Activity {
    ImageView imageViewLeftP011;
    ImageView imageViewRightP011;
    RelativeLayout relativeLayoutP011;
    RelativeLayout relativeLayout2P011;
    RelativeLayout relativeLayout3P011;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p011dst_in_out_over);

        imageViewLeftP011= findViewById(R.id.imageViewLeftP011);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(200,200)
                .into(imageViewLeftP011);

        imageViewRightP011= findViewById(R.id.imageViewRightP011);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/agapanthus.jpg")
                .resize(200,200)
                .into(imageViewRightP011);

        relativeLayoutP011= findViewById(R.id.relativeLayoutP011);
        relativeLayout2P011= findViewById(R.id.relativeLayout2P011);
        relativeLayout3P011= findViewById(R.id.relativeLayout3P011);

    }

    public void onClickMtdP011(View view) {
        Drawable drawableSource= imageViewLeftP011.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP011.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayoutP011.addView(new P011View(this,bitmapSource,bitmapDest,"DST_IN"));
    }

    public void onClickMtd2P011(View view) {
        Drawable drawableSource= imageViewLeftP011.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP011.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout2P011.addView(new P011View(this,bitmapSource,bitmapDest,"DST_OUT"));
    }
    public void onClickMtd3P011(View view) {
        Drawable drawableSource= imageViewLeftP011.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP011.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout3P011.addView(new P011View(this,bitmapSource,bitmapDest,"DST_OVER"));
    }
}
