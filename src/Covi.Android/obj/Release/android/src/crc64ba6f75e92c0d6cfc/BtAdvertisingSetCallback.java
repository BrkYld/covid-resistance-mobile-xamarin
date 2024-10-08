package crc64ba6f75e92c0d6cfc;


public class BtAdvertisingSetCallback
	extends android.bluetooth.le.AdvertisingSetCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdvertisingSetStarted:(Landroid/bluetooth/le/AdvertisingSet;II)V:GetOnAdvertisingSetStarted_Landroid_bluetooth_le_AdvertisingSet_IIHandler\n" +
			"n_onScanResponseDataSet:(Landroid/bluetooth/le/AdvertisingSet;I)V:GetOnScanResponseDataSet_Landroid_bluetooth_le_AdvertisingSet_IHandler\n" +
			"";
		mono.android.Runtime.register ("Covi.Droid.Features.Bluetooth.Advertising.BtAdvertisingSetCallback, Covi.Android", BtAdvertisingSetCallback.class, __md_methods);
	}


	public BtAdvertisingSetCallback ()
	{
		super ();
		if (getClass () == BtAdvertisingSetCallback.class)
			mono.android.TypeManager.Activate ("Covi.Droid.Features.Bluetooth.Advertising.BtAdvertisingSetCallback, Covi.Android", "", this, new java.lang.Object[] {  });
	}


	public void onAdvertisingSetStarted (android.bluetooth.le.AdvertisingSet p0, int p1, int p2)
	{
		n_onAdvertisingSetStarted (p0, p1, p2);
	}

	private native void n_onAdvertisingSetStarted (android.bluetooth.le.AdvertisingSet p0, int p1, int p2);


	public void onScanResponseDataSet (android.bluetooth.le.AdvertisingSet p0, int p1)
	{
		n_onScanResponseDataSet (p0, p1);
	}

	private native void n_onScanResponseDataSet (android.bluetooth.le.AdvertisingSet p0, int p1);

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
