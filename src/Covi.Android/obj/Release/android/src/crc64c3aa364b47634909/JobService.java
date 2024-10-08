package crc64c3aa364b47634909;


public class JobService
	extends androidx.core.app.JobIntentService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHandleWork:(Landroid/content/Intent;)V:GetOnHandleWork_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("Covi.Droid.Features.Services.JobService, Covi.Android", JobService.class, __md_methods);
	}


	public JobService ()
	{
		super ();
		if (getClass () == JobService.class)
			mono.android.TypeManager.Activate ("Covi.Droid.Features.Services.JobService, Covi.Android", "", this, new java.lang.Object[] {  });
	}


	public void onHandleWork (android.content.Intent p0)
	{
		n_onHandleWork (p0);
	}

	private native void n_onHandleWork (android.content.Intent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
