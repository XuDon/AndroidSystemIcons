package com.example.a13.androidsystemicon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyBaseAdapter baseAdapter;
    ArrayList<Item> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        baseAdapter = new MyBaseAdapter(MainActivity.this,list);
        //添加系统图标
        list.add(new Item(android.R.drawable.alert_light_frame,"alert_light_frame",android.R.drawable.ic_menu_report_image,"ic_menu_report_image"));
        list.add(new Item(android.R.drawable.alert_dark_frame,"alert_dark_frame",android.R.drawable.alert_light_frame,"alert_light_frame"));
        list.add(new Item(android.R.drawable.arrow_down_float,"arrow_down_float",android.R.drawable.arrow_up_float,"arrow_up_float"));
        list.add(new Item(android.R.drawable.bottom_bar,"bottom_bar",android.R.drawable.btn_default,"btn_default"));
        list.add(new Item(android.R.drawable.btn_default_small,"btn_default_small",android.R.drawable.btn_dialog,"btn_dialog"));
        list.add(new Item(android.R.drawable.btn_dropdown,"btn_dropdown",android.R.drawable.btn_minus,"btn_minus"));
        list.add(new Item(android.R.drawable.btn_plus,"btn_plus",android.R.drawable.btn_radio,"btn_radio"));
        list.add(new Item(android.R.drawable.btn_star,"btn_star",android.R.drawable.btn_star_big_off,"btn_star_big_off"));
        list.add(new Item(android.R.drawable.btn_star_big_on,"btn_star_big_on",android.R.drawable.button_onoff_indicator_off,"button_onoff_indicator_off"));
        list.add(new Item(android.R.drawable.button_onoff_indicator_on,"button_onoff_indicator_on",android.R.drawable.checkbox_off_background,"checkbox_off_background"));
        list.add(new Item(android.R.drawable.checkbox_on_background,"checkbox_on_background",android.R.drawable.dark_header,"dark_header"));
        list.add(new Item(android.R.drawable.dialog_frame,"dialog_frame",android.R.drawable.dialog_holo_dark_frame,"dialog_holo_dark_frame"));
        list.add(new Item(android.R.drawable.dialog_holo_light_frame,"dialog_holo_light_frame",android.R.drawable.divider_horizontal_bright,"divider_horizontal_bright"));
        list.add(new Item(android.R.drawable.divider_horizontal_dark,"",android.R.drawable.editbox_dropdown_light_frame,""));
        list.add(new Item(android.R.drawable.gallery_thumb,"gallery_thumb",android.R.drawable.ic_btn_speak_now,"ic_btn_speak_now"));
        list.add(new Item(android.R.drawable.ic_delete,"ic_delete",android.R.drawable.ic_dialog_alert,"ic_dialog_alert"));
        list.add(new Item(android.R.drawable.ic_dialog_dialer,"ic_dialog_dialer",android.R.drawable.ic_dialog_email,"ic_dialog_email"));
        list.add(new Item(android.R.drawable.ic_dialog_info,"ic_dialog_info",android.R.drawable.ic_dialog_map,"ic_dialog_map"));
        list.add(new Item(android.R.drawable.ic_dialog_map,"ic_dialog_map",android.R.drawable.ic_input_add,"ic_input_add"));
        list.add(new Item(android.R.drawable.ic_input_delete,"ic_input_delete",android.R.drawable.ic_input_get,"ic_input_get"));
        list.add(new Item(android.R.drawable.ic_lock_idle_alarm,"ic_lock_idle_alarm",android.R.drawable.ic_lock_idle_charging,"ic_lock_idle_charging"));
        list.add(new Item(android.R.drawable.ic_lock_idle_lock,"ic_lock_idle_lock",android.R.drawable.ic_lock_idle_low_battery,"ic_lock_idle_low_battery"));
        list.add(new Item(android.R.drawable.ic_lock_lock,"ic_lock_lock",android.R.drawable.ic_lock_power_off,"ic_lock_power_off"));
        list.add(new Item(android.R.drawable.ic_lock_silent_mode,"ic_lock_silent_mode",android.R.drawable.ic_lock_silent_mode_off,"ic_lock_silent_mode_off"));
        list.add(new Item(android.R.drawable.ic_media_ff,"ic_media_ff",android.R.drawable.ic_media_next,"ic_media_next"));
        list.add(new Item(android.R.drawable.ic_media_pause,"ic_media_pause",android.R.drawable.ic_media_play,"ic_media_play"));
        list.add(new Item(android.R.drawable.ic_media_previous,"ic_media_previous",android.R.drawable.ic_media_rew,"ic_media_rew"));
        list.add(new Item(android.R.drawable.ic_menu_add,"ic_menu_add",android.R.drawable.ic_menu_agenda,"ic_menu_agenda"));
        list.add(new Item(android.R.drawable.ic_menu_always_landscape_portrait,"ic_menu_always_landscape_portrait",android.R.drawable.ic_menu_call,"ic_menu_call"));
        list.add(new Item(android.R.drawable.ic_menu_camera,"ic_menu_camera",android.R.drawable.ic_menu_close_clear_cancel,"ic_menu_close_clear_cancel"));
        list.add(new Item(android.R.drawable.ic_menu_compass,"ic_menu_compass",android.R.drawable.ic_menu_crop,"ic_menu_crop"));
        list.add(new Item(android.R.drawable.ic_menu_day,"ic_menu_day",android.R.drawable.ic_menu_delete,"ic_menu_delete"));
        list.add(new Item(android.R.drawable.ic_menu_directions,"ic_menu_directions",android.R.drawable.ic_menu_edit,"ic_menu_edit"));
        list.add(new Item(android.R.drawable.ic_menu_gallery,"ic_menu_gallery",android.R.drawable.ic_menu_help,"ic_menu_help"));
        list.add(new Item(android.R.drawable.ic_menu_info_details,"ic_menu_info_details",android.R.drawable.ic_menu_manage,"ic_menu_manage"));
        list.add(new Item(android.R.drawable.ic_menu_mapmode,"ic_menu_mapmode",android.R.drawable.ic_menu_month,"ic_menu_month"));
        list.add(new Item(android.R.drawable.ic_menu_more,"ic_menu_more",android.R.drawable.ic_menu_my_calendar,"ic_menu_my_calendar"));
        list.add(new Item(android.R.drawable.ic_menu_mylocation,"ic_menu_mylocation",android.R.drawable.ic_menu_myplaces,"ic_menu_myplaces"));
        list.add(new Item(android.R.drawable.ic_menu_preferences,"ic_menu_preferences",android.R.drawable.ic_menu_recent_history,"ic_menu_recent_history"));
        list.add(new Item(android.R.drawable.ic_menu_revert,"ic_menu_revert",android.R.drawable.ic_menu_rotate,"ic_menu_rotate"));
        list.add(new Item(android.R.drawable.ic_menu_save,"ic_menu_save",android.R.drawable.ic_menu_search,"ic_menu_search"));
        list.add(new Item(android.R.drawable.ic_menu_send,"ic_menu_send",android.R.drawable.ic_menu_set_as,"ic_menu_set_as"));
        list.add(new Item(android.R.drawable.ic_menu_share,"ic_menu_share",android.R.drawable.ic_menu_slideshow,"ic_menu_slideshow"));
        list.add(new Item(android.R.drawable.ic_menu_sort_alphabetically,"ic_menu_sort_alphabetically",android.R.drawable.ic_menu_sort_by_size,"ic_menu_sort_by_size"));
        list.add(new Item(android.R.drawable.ic_menu_today,"ic_menu_today",android.R.drawable.ic_menu_upload,"ic_menu_upload"));
        list.add(new Item(android.R.drawable.ic_menu_upload_you_tube,"ic_menu_upload_you_tube",android.R.drawable.ic_menu_view,"ic_menu_view"));
        list.add(new Item(android.R.drawable.ic_menu_week,"ic_menu_week",android.R.drawable.ic_menu_zoom,"ic_menu_zoom"));
        list.add(new Item(android.R.drawable.ic_notification_clear_all,"ic_notification_clear_all",android.R.drawable.ic_notification_overlay,"ic_notification_overlay"));
        list.add(new Item(android.R.drawable.ic_partial_secure,"ic_partial_secure",android.R.drawable.ic_popup_disk_full,"ic_popup_disk_full"));
        list.add(new Item(android.R.drawable.ic_popup_reminder,"ic_popup_reminder",android.R.drawable.ic_popup_sync,"ic_popup_sync"));
        list.add(new Item(android.R.drawable.ic_search_category_default,"ic_search_category_default",android.R.drawable.ic_secure,"ic_secure"));
        list.add(new Item(android.R.drawable.list_selector_background,"list_selector_background",android.R.drawable.menu_frame,"menu_frame"));
        list.add(new Item(android.R.drawable.menu_full_frame,"menu_full_frame",android.R.drawable.menuitem_background,"menuitem_background"));
        list.add(new Item(android.R.drawable.picture_frame,"picture_frame",android.R.drawable.presence_audio_away,"presence_audio_away"));
        list.add(new Item(android.R.drawable.presence_busy,"presence_busy",android.R.drawable.presence_invisible,"presence_invisible"));
        list.add(new Item(android.R.drawable.presence_offline,"presence_offline",android.R.drawable.presence_online,"presence_online"));
        list.add(new Item(android.R.drawable.presence_video_away,"presence_video_away",android.R.drawable.presence_video_busy,"presence_video_busy"));
        list.add(new Item(android.R.drawable.presence_video_online,"presence_video_online",android.R.drawable.progress_horizontal,"progress_horizontal"));
        list.add(new Item(android.R.drawable.progress_indeterminate_horizontal,"progress_indeterminate_horizontal",android.R.drawable.radiobutton_off_background,"radiobutton_off_background"));
        list.add(new Item(android.R.drawable.radiobutton_on_background,"radiobutton_on_background",android.R.drawable.screen_background_dark,"screen_background_dark"));
        list.add(new Item(android.R.drawable.screen_background_dark_transparent,"screen_background_dark_transparent",android.R.drawable.screen_background_light,"screen_background_light"));
        list.add(new Item(android.R.drawable.spinner_background,"spinner_background",android.R.drawable.spinner_dropdown_background,"spinner_dropdown_background"));
        list.add(new Item(android.R.drawable.star_big_off,"star_big_off",android.R.drawable.star_big_on,"star_big_on"));
        list.add(new Item(android.R.drawable.star_off,"star_off",android.R.drawable.star_on,"star_on"));
        list.add(new Item(android.R.drawable.stat_notify_call_mute,"stat_notify_call_mute",android.R.drawable.stat_notify_chat,"stat_notify_chat"));
        list.add(new Item(android.R.drawable.stat_notify_error,"stat_notify_error",android.R.drawable.stat_notify_missed_call,"stat_notify_missed_call"));
        list.add(new Item(android.R.drawable.stat_notify_more,"stat_notify_more",android.R.drawable.stat_notify_sdcard,"stat_notify_sdcard"));
        list.add(new Item(android.R.drawable.stat_notify_sdcard_prepare,"stat_notify_sdcard_prepare",android.R.drawable.stat_notify_sdcard_usb,"stat_notify_sdcard_usb"));
        list.add(new Item(android.R.drawable.stat_notify_sync,"stat_notify_sync",android.R.drawable.stat_notify_sync_noanim,"stat_notify_sync_noanim"));
        list.add(new Item(android.R.drawable.stat_notify_voicemail,"stat_notify_voicemail",android.R.drawable.stat_sys_data_bluetooth,"stat_sys_data_bluetooth"));
        list.add(new Item(android.R.drawable.stat_sys_download,"stat_sys_download",android.R.drawable.stat_sys_download_done,"stat_sys_download_done"));
        list.add(new Item(android.R.drawable.stat_sys_headset,"stat_sys_headset",android.R.drawable.stat_sys_speakerphone,"stat_sys_speakerphone"));
        list.add(new Item(android.R.drawable.stat_sys_upload,"stat_sys_upload",android.R.drawable.stat_sys_upload_done,"stat_sys_upload_done"));
        list.add(new Item(android.R.drawable.stat_sys_warning,"stat_sys_warning",android.R.drawable.status_bar_item_app_background,"status_bar_item_app_background"));
        list.add(new Item(android.R.drawable.status_bar_item_background,"status_bar_item_background",android.R.drawable.sym_action_call,"sym_action_call"));
        list.add(new Item(android.R.drawable.sym_action_chat,"sym_action_chat",android.R.drawable.sym_action_email,"sym_action_email"));
        list.add(new Item(android.R.drawable.sym_call_incoming,"sym_call_incoming",android.R.drawable.sym_call_missed,"sym_call_missed"));
        list.add(new Item(android.R.drawable.sym_call_outgoing,"sym_call_outgoing",android.R.drawable.sym_contact_card,"sym_contact_card"));
        list.add(new Item(android.R.drawable.sym_def_app_icon,"sym_def_app_icon",android.R.drawable.title_bar,"title_bar"));
        list.add(new Item(android.R.drawable.title_bar_tall,"title_bar_tall",android.R.drawable.toast_frame,"toast_frame"));
        list.add(new Item(android.R.drawable.zoom_plate,"zoom_plate",android.R.drawable.stat_sys_phone_call,"stat_sys_phone_call"));


        listView.setAdapter(baseAdapter);
    }
}
