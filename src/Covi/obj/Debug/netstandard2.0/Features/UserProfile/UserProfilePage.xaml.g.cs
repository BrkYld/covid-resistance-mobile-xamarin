//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:8.0.6
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

[assembly: global::Xamarin.Forms.Xaml.XamlResourceIdAttribute("Covi.Features.UserProfile.UserProfilePage.xaml", "Features/UserProfile/UserProfilePage.xaml", typeof(global::Covi.Features.UserProfile.UserProfilePage))]

namespace Covi.Features.UserProfile {
    
    
    [global::Xamarin.Forms.Xaml.XamlFilePathAttribute("Features/UserProfile/UserProfilePage.xaml")]
    public partial class UserProfilePage : global::Xamarin.Forms.ContentPage {
        
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
        private global::Xamarin.Forms.ContentView Header;
        
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
        private global::Covi.Features.UserProfile.Components.UserStatusCard.UserStatusCardView userStatusCardView;
        
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
        private global::Covi.Features.UserProfile.Components.ChangeStatus.ChangeStatusView changeStatus;
        
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
        private global::Covi.Features.UserProfile.Components.HealthStatusAdvice.HealthStatusAdviceView infectedStatusNotificationView;
        
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
        private global::Covi.Features.UserProfile.Components.EncryptionStatus.EncryptionStatusView encryption;
        
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
        private global::Covi.Features.UserProfile.Components.BluetoothReminder.BluetoothReminderView bluetooth;
        
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
        private void InitializeComponent() {
            global::Xamarin.Forms.Xaml.Extensions.LoadFromXaml(this, typeof(UserProfilePage));
            Header = global::Xamarin.Forms.NameScopeExtensions.FindByName<global::Xamarin.Forms.ContentView>(this, "Header");
            userStatusCardView = global::Xamarin.Forms.NameScopeExtensions.FindByName<global::Covi.Features.UserProfile.Components.UserStatusCard.UserStatusCardView>(this, "userStatusCardView");
            changeStatus = global::Xamarin.Forms.NameScopeExtensions.FindByName<global::Covi.Features.UserProfile.Components.ChangeStatus.ChangeStatusView>(this, "changeStatus");
            infectedStatusNotificationView = global::Xamarin.Forms.NameScopeExtensions.FindByName<global::Covi.Features.UserProfile.Components.HealthStatusAdvice.HealthStatusAdviceView>(this, "infectedStatusNotificationView");
            encryption = global::Xamarin.Forms.NameScopeExtensions.FindByName<global::Covi.Features.UserProfile.Components.EncryptionStatus.EncryptionStatusView>(this, "encryption");
            bluetooth = global::Xamarin.Forms.NameScopeExtensions.FindByName<global::Covi.Features.UserProfile.Components.BluetoothReminder.BluetoothReminderView>(this, "bluetooth");
        }
    }
}
