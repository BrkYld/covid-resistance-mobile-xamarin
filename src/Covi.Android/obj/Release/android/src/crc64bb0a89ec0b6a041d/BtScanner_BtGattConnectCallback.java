package crc64bb0a89ec0b6a041d;


public class BtScanner_BtGattConnectCallback
	extends android.bluetooth.BluetoothGattCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionStateChange:(Landroid/bluetooth/BluetoothGatt;II)V:GetOnConnectionStateChange_Landroid_bluetooth_BluetoothGatt_IIHandler\n" +
			"n_onServicesDiscovered:(Landroid/bluetooth/BluetoothGatt;I)V:GetOnServicesDiscovered_Landroid_bluetooth_BluetoothGatt_IHandler\n" +
			"n_onCharacteristicRead:(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V:GetOnCharacteristicRead_Landroid_bluetooth_BluetoothGatt_Landroid_bluetooth_BluetoothGattCharacteristic_IHandler\n" +
			"";
		mono.android.Runtime.register ("Covi.Droid.Features.Bluetooth.BtScanner+BtGattConnectCallback, Covi.Android", BtScanner_BtGattConnectCallback.class, __md_methods);
	}


	public BtScanner_BtGattConnectCallback ()
	{
		super ();
		if (getClass () == BtScanner_BtGattConnectCallback.class)
			mono.android.TypeManager.Activate ("Covi.Droid.Features.Bluetooth.BtScanner+BtGattConnectCallback, Covi.Android", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionStateChange (android.bluetooth.BluetoothGatt p0, int p1, int p2)
	{
		n_onConnectionStateChange (p0, p1, p2);
	}

	private native void n_onConnectionStateChange (android.bluetooth.BluetoothGatt p0, int p1, int p2);


	public void onServicesDiscovered (android.bluetooth.BluetoothGatt p0, int p1)
	{
		n_onServicesDiscovered (p0, p1);
	}

	private native void n_onServicesDiscovered (android.bluetooth.BluetoothGatt p0, int p1);


	public void onCharacteristicRead (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2)
	{
		n_onCharacteristicRead (p0, p1, p2);
	}

	private native void n_onCharacteristicRead (android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, int p2);

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
