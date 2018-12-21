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

public class P012SrcInOutOver extends Activity {
    ImageView imageViewLeftP012;
    ImageView imageViewRightP012;
    RelativeLayout relativeLayoutP012;
    RelativeLayout relativeLayout2P012;
    RelativeLayout relativeLayout3P012;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p012src_in_out_over);

        imageViewLeftP012= findViewById(R.id.imageViewLeftP012);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(200,200)
                .into(imageViewLeftP012);

        imageViewRightP012= findViewById(R.id.imageViewRightP012);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/agapanthus.jpg")
                .resize(200,200)
                .into(imageViewRightP012);

        relativeLayoutP012= findViewById(R.id.relativeLayoutP012);
        relativeLayout2P012= findViewById(R.id.relativeLayout2P012);
        relativeLayout3P012= findViewById(R.id.relativeLayout3P012);

    }

    public void onClickMtdP012(View view) {
        Drawable drawableSource= imageViewLeftP012.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP012.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayoutP012.addView(new P012View(this,bitmapSource,bitmapDest,"SRC_IN"));
    }

    public void onClickMtd2P012(View view) {
        Drawable drawableSource= imageViewLeftP012.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP012.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout2P012.addView(new P012View(this,bitmapSource,bitmapDest,"SRC_OUT"));
    }
    public void onClickMtd3P012(View view) {
        Drawable drawableSource= imageViewLeftP012.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP012.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout3P012.addView(new P012View(this,bitmapSource,bitmapDest,"SRC_OVER"));
    }
}
