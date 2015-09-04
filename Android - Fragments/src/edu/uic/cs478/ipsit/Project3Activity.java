package edu.uic.cs478.ipsit;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Project3Activity extends FragmentActivity {
	
	/*Fragment 1 objects*/
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private Button button;
	
	private FrameLayout frameLayout;
	
	/*Fragment 2 objects*/
	private GridFragment mGridFragment1 = new GridFragment();
	private GridFragment mGridFragment2 = new GridFragment();
	private GridFragment mGridFragment3 = new GridFragment();


	/*/Begin the activity/*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/*Get main activity*/
		setContentView(R.layout.activity_main);
		
		
		/*Get main activity*/
		textview3 = (TextView)findViewById(R.id.places);
		textview1 = (TextView)findViewById(R.id.cars);
		textview2 = (TextView)findViewById(R.id.bike);
		
		
		
		
		button = (Button)findViewById(R.id.button);
		frameLayout = (FrameLayout)findViewById(R.id.change_frag);
		
		
		
		/*Listener for the car Grid*/
		textview1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				/*Call the fragmentManager*/
				FragmentManager fm = getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				
				/*Invoke the URLS*/
				bundle.putStringArray("images", URLHolder.getCars());
				if(mGridFragment1.getArguments()!= null){
					mGridFragment1.getArguments().putAll(bundle);
					
				}else{
					mGridFragment1.setArguments(bundle);
				}
				
				/*Place images*/
				ft.replace(R.id.change_frag,mGridFragment1,"GRID_VIEW_FRAG");
				ft.commit();
			}
		});
		
	
		/*Listener for the Bike Grid*/
		textview2.setOnClickListener(new View.OnClickListener() {
		
			
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				/*Call the fragmentManager*/
				FragmentManager fm = getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				
				/*Invoke the URLS*/
				bundle.putStringArray("images", URLHolder.getBikes());
				if(mGridFragment2.getArguments()!= null){
					mGridFragment2.getArguments().putAll(bundle);
				}else{
					mGridFragment2.setArguments(bundle);
				}
				
				/*Place images*/
				ft.replace(R.id.change_frag,mGridFragment2,"GRID_VIEW_FRAG");
				ft.commit();
			}
		});
		
		
		/*Listener for the car Grid*/
		textview3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				/*Call the fragmentManager*/
				FragmentManager fm = getSupportFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				
				/*Invoke the URLS*/
				bundle.putStringArray("images", URLHolder.getPlaces());
				if(mGridFragment3.getArguments()!= null){
					mGridFragment3.getArguments().putAll(bundle);
					
				}else{
					mGridFragment3.setArguments(bundle);
				}
				
				/*Place images*/
				ft.replace(R.id.change_frag,mGridFragment3,"GRID_VIEW_FRAG");
				ft.commit();
			}
		});
		
		
		/*Status Button Activity tracker*/
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//flags for the status
				boolean x,y,a,b,p,q;
				ImageAdapter im = new ImageAdapter();
				
				/*Car*/
				x = mGridFragment1.isVisible();
				y = mGridFragment1.isVisib();
				
				/*bike*/
				a = mGridFragment2.isVisible();
				b = mGridFragment2.isVisib();
				
				/*Nature*/
				p = mGridFragment3.isVisible();
				q = mGridFragment3.isVisib();
				Context context = getApplicationContext();
				
				CharSequence text = null;
				int duration = Toast.LENGTH_LONG;
				//if download still happening
				if(im.status() != null && im.status() == "running"){
					text = "Downloading";
				}
				else{
					//if complete
					if((x==true || a== true || p == true) && (y==false || b==false || q==false)){
						text = "Showing Downloaded thumbnails";
					}else if((x == false || a==false || p==false) && (y == true||b==true||q==true)){
						//selected picture display
						text = "Showing Selected picture";
					}else{
						//no activity
						text = "Idle";
					}
				}
				
				
				//Show the status 
				final Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});
	}

	
}
