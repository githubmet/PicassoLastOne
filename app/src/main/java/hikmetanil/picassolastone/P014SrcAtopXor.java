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
import hikmetanil.picassolastone.view.P014View;

public class P014SrcAtopXor extends Activity {
    ImageView imageViewLeftP014;
    ImageView imageViewRightP014;
    RelativeLayout relativeLayoutP014;
    RelativeLayout relativeLayout2P014;
    RelativeLayout relativeLayout3P014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p014src_atop_xor);

        imageViewLeftP014= findViewById(R.id.imageViewLeftP014);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(200,200)
                .into(imageViewLeftP014);

        imageViewRightP014= findViewById(R.id.imageViewRightP014);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/agapanthus.jpg")
                .resize(200,200)
                .into(imageViewRightP014);

        relativeLayoutP014= findViewById(R.id.relativeLayoutP014);
        relativeLayout2P014= findViewById(R.id.relativeLayout2P014);
        relativeLayout3P014= findViewById(R.id.relativeLayout3P014);

    }

    public void onClickMtdP014(View view) {
        Drawable drawableSource= imageViewLeftP014.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP014.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayoutP014.addView(new P014View(this,bitmapSource,bitmapDest,"SRC"));
    }

    public void onClickMtd2P014(View view) {
        Drawable drawableSource= imageViewLeftP014.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP014.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout2P014.addView(new P014View(this,bitmapSource,bitmapDest,"SRC_ATOP"));
    }
    public void onClickMtd3P014(View view) {
        Drawable drawableSource= imageViewLeftP014.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP014.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout3P014.addView(new P014View(this,bitmapSource,bitmapDest,"XOR"));
    }
}
