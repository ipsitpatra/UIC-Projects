package edu.uic.cs478.ipsit;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class Project2ImageHolder extends ImageView{
	
	//Extending from ImageView, set all the constructor for the super call. 
		
	public Project2ImageHolder(Context context)
    {
        super(context);
    }

    public Project2ImageHolder(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public Project2ImageHolder(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        /*Snap to width*/
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); 
    }
}
