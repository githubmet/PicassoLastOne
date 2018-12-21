package hikmetanil.picassolastone;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import hikmetanil.picassolastone.transform.P007Transform;

public class P007FrameOnPicture extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView imageView=new ImageView(this);
        Picasso.Builder builder=new Picasso.Builder(this);
        builder.listener(new Picasso.Listener() {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                Toast.makeText(P007FrameOnPicture.this, R.string.error, Toast.LENGTH_SHORT).show();
            }
        }).build()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(400,400)
                .transform(new P007Transform())
                .into(imageView);

        setContentView(imageView);

    }
}
