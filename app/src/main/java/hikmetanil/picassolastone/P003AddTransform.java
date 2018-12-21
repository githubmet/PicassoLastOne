package hikmetanil.picassolastone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import hikmetanil.picassolastone.transform.P003Transformation;

public class P003AddTransform extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView imageView=new ImageView(this);

        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/aloe_vera.jpg")
                .resize(400,400)
                .transform(new P003Transformation())
                .into(imageView);
        setContentView(imageView);
    }
}
