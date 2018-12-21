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

public class P010LightenDstAtop extends Activity {
    ImageView imageViewLeftP010;
    ImageView imageViewRightP010;
    RelativeLayout relativeLayoutP010;
    RelativeLayout relativeLayout2P010;
    RelativeLayout relativeLayout3P010;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p010lighten_dst_atop);

        imageViewLeftP010= findViewById(R.id.imageViewLeftP010);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(200,200)
                .into(imageViewLeftP010);

        imageViewRightP010= findViewById(R.id.imageViewRightP010);
        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/agapanthus.jpg")
                .resize(200,200)
                .into(imageViewRightP010);

        relativeLayoutP010= findViewById(R.id.relativeLayoutP010);
        relativeLayout2P010= findViewById(R.id.relativeLayout2P010);
        relativeLayout3P010= findViewById(R.id.relativeLayout3P010);

    }

    public void onClickMtdP010(View view) {
        Drawable drawableSource= imageViewLeftP010.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP010.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayoutP010.addView(new P010View(this,bitmapSource,bitmapDest,"LIGHTEN"));
    }

    public void onClickMtd2P010(View view) {
        Drawable drawableSource= imageViewLeftP010.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP010.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout2P010.addView(new P010View(this,bitmapSource,bitmapDest,"DST"));
    }
    public void onClickMtd3P010(View view) {
        Drawable drawableSource= imageViewLeftP010.getDrawable();
        Bitmap bitmapSource= ((BitmapDrawable)drawableSource).getBitmap();

        Drawable drawableDest= imageViewRightP010.getDrawable();
        Bitmap bitmapDest= ((BitmapDrawable)drawableDest).getBitmap();

        relativeLayout3P010.addView(new P010View(this,bitmapSource,bitmapDest,"DST_ATOP"));
    }
}
