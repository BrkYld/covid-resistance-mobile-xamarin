package crc645eccd79e27a79cc3;


public class BtGattServerCallback
	extends android.bluetooth.BluetoothGattServerCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionStateChange:(Landroid/bluetooth/BluetoothDevice;II)V:GetOnConnectionStateChange_Landroid_bluetooth_BluetoothDevice_IIHandler\n" +
			"n_onCharacteristicReadRequest:(Landroid/bluetooth/BluetoothDevice;IILandroid/bluetooth/BluetoothGattCharacteristic;)V:GetOnCharacteristicReadRequest_Landroid_bluetooth_BluetoothDevice_IILandroid_bluetooth_BluetoothGattCharacteristic_Handler\n" +
			"";
		mono.android.Runtime.register ("Covi.Droid.Features.Bluetooth.Gatt.BtGattServerCallback, Covi.Android", BtGattServerCallback.class, __md_methods);
	}


	public BtGattServerCallback ()
	{
		super ();
		if (getClass () == BtGattServerCallback.class)
			mono.android.TypeManager.Activate ("Covi.Droid.Features.Bluetooth.Gatt.BtGattServerCallback, Covi.Android", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionStateChange (android.bluetooth.BluetoothDevice p0, int p1, int p2)
	{
		n_onConnectionStateChange (p0, p1, p2);
	}

	private native void n_onConnectionStateChange (android.bluetooth.BluetoothDevice p0, int p1, int p2);


	public void onCharacteristicReadRequest (android.bluetooth.BluetoothDevice p0, int p1, int p2, android.bluetooth.BluetoothGattCharacteristic p3)
	{
		n_onCharacteristicReadRequest (p0, p1, p2, p3);
	}

	private native void n_onCharacteristicReadRequest (android.bluetooth.BluetoothDevice p0, int p1, int p2, android.bluetooth.BluetoothGattCharacteristic p3);

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
