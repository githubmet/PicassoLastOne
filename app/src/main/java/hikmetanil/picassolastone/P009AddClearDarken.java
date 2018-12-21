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

import hikmetanil.picassolastone.view.P009View;

public class P009AddClearDarken extends Activity {
    ImageView imageViewLeftP009;
    ImageView imageViewRightP009;
    RelativeLayout relativeLayoutP009;
    RelativeLayout relativeLayout2P009;
    RelativeLayout relativeLayout3P009;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p009add_clear_darken);

        imageViewLeftP009= findViewById(R.id.imageViewLeftP009);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(200,200)
                .into(imageViewLeftP009);

        imageViewRightP009= findViewById(R.id.imageViewRightP009);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/agapanthus.jpg")
                .resize(200,200)
                .into(imageViewRightP009);

        relativeLayoutP009= findViewById(R.id.relativeLayoutP009);
        relativeLayout2P009= findViewById(R.id.relativeLayout2P009);
        relativeLayout3P009= findViewById(R.id.relativeLayout3P009);

    }

    public void onClickMtdP009(View view) {
        Drawable drawableSource= imageViewLeftP009.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP009.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayoutP009.addView(new P009View(this,bitmapSource,bitmapDest,"ADD"));
    }

    public void onClickMtd2P009(View view) {
        Drawable drawableSource= imageViewLeftP009.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP009.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout2P009.addView(new P009View(this,bitmapSource,bitmapDest,"CLEAR"));
    }
    public void onClickMtd3P009(View view) {
        Drawable drawableSource= imageViewLeftP009.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP009.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout3P009.addView(new P009View(this,bitmapSource,bitmapDest,"DARKEN"));
    }
}
