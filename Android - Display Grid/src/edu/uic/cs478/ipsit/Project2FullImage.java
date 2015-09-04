package edu.uic.cs478.ipsit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Project2FullImage extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//getting xml config from full_image.xml 
		setContentView(R.layout.full_image);
		
		Intent i = getIntent();
		
		int position = i.getExtras().getInt("id");
		Project2ImageAdapter imageAdapter = new Project2ImageAdapter(this);
		
		ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
		//Extracting image information from the item and displaying
		imageView.setImageResource(((Project2Item)imageAdapter.getItem(position)).drawableId);
		
	}
}
