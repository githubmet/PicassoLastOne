package hikmetanil.picassolastone;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class P002PicassoBuilder extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView imageView=new ImageView(this);

        Picasso.Builder builder=new Picasso.Builder(this);
        builder.listener(new Picasso.Listener() {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                Toast.makeText(P002PicassoBuilder.this, R.string.error, Toast.LENGTH_SHORT).show();
            }
        });
        Picasso picasso= builder.build();
        picasso.load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .into(imageView);

        setContentView(imageView);
    }
}
