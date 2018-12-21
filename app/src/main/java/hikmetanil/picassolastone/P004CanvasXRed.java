package hikmetanil.picassolastone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import hikmetanil.picassolastone.transform.P004Transform;

public class P004CanvasXRed extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView imageView=new ImageView(this);

        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(400,400)
                .transform(new P004Transform())
                .into(imageView);
        setContentView(imageView);
    }
}
