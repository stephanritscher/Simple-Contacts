package com.simplemobiletools.contacts.pro.helpers

import android.provider.ContactsContract.CommonDataKinds
import com.simplemobiletools.commons.extensions.normalizeString
import com.simplemobiletools.commons.helpers.TAB_CONTACTS
import com.simplemobiletools.commons.helpers.TAB_FAVORITES
import com.simplemobiletools.commons.helpers.TAB_GROUPS
import com.simplemobiletools.contacts.pro.models.LocalContact

// shared prefs
const val SHOW_CONTACT_THUMBNAILS = "show_contact_thumbnails"
const val SHOW_PHONE_NUMBERS = "show_phone_numbers"
const val SHOW_ONLY_CONTACTS_WITH_NUMBERS = "show_only_contacts_with_numbers"
const val IGNORED_CONTACT_SOURCES = "ignored_contact_sources_2"
const val LAST_USED_CONTACT_SOURCE = "last_used_contact_source"
const val ON_CONTACT_CLICK = "on_contact_click"
const val SHOW_CONTACT_FIELDS = "show_contact_fields"
const val SHOW_TABS = "show_tabs"
const val SHOW_DIALPAD_BUTTON = "show_dialpad_button"
const val SPEED_DIAL = "speed_dial"
const val LAST_EXPORT_PATH = "last_export_path"
const val WAS_LOCAL_ACCOUNT_INITIALIZED = "was_local_account_initialized"
const val SHOW_PRIVATE_CONTACTS = "show_private_contacts"
const val MERGE_DUPLICATE_CONTACTS = "merge_duplicate_contacts"
const val FAVORITES_CONTACTS_ORDER = "favorites_contacts_order"
const val FAVORITES_CUSTOM_ORDER_SELECTED = "favorites_custom_order_selected"

const val GROUP = "group"
const val IS_FROM_SIMPLE_CONTACTS = "is_from_simple_contacts"
const val ADD_NEW_CONTACT_NUMBER = "add_new_contact_number"
const val FIRST_CONTACT_ID = 1000000
const val FIRST_GROUP_ID = 10000L
const val DEFAULT_FILE_NAME = "contacts.vcf"
const val AVOID_CHANGING_TEXT_TAG = "avoid_changing_text_tag"
const val AVOID_CHANGING_VISIBILITY_TAG = "avoid_changing_visibility_tag"

// extras used at third party intents
const val KEY_NAME = "name"
const val KEY_EMAIL = "email"
const val KEY_MAILTO = "mailto"

const val LOCATION_CONTACTS_TAB = 0
const val LOCATION_FAVORITES_TAB = 1
const val LOCATION_GROUP_CONTACTS = 2
const val LOCATION_INSERT_OR_EDIT = 3

const val ALL_TABS_MASK = TAB_CONTACTS or TAB_FAVORITES or TAB_GROUPS

val tabsList = arrayListOf(
    TAB_CONTACTS,
    TAB_FAVORITES,
    TAB_GROUPS
)

// contact photo changes
const val PHOTO_ADDED = 1
const val PHOTO_REMOVED = 2
const val PHOTO_CHANGED = 3
const val PHOTO_UNCHANGED = 4

// phone number/email types
const val CELL = "CELL"
const val WORK = "WORK"
const val HOME = "HOME"
const val OTHER = "OTHER"
const val PREF = "PREF"
const val MAIN = "MAIN"
const val FAX = "FAX"
const val WORK_FAX = "WORK;FAX"
const val HOME_FAX = "HOME;FAX"
const val PAGER = "PAGER"
const val MOBILE = "MOBILE"

// IMs not supported by Ez-vcard
const val HANGOUTS = "Hangouts"
const val QQ = "QQ"
const val JABBER = "Jabber"

const val ON_CLICK_CALL_CONTACT = 1
const val ON_CLICK_VIEW_CONTACT = 2
const val ON_CLICK_EDIT_CONTACT = 3

// visible fields filtering
const val SHOW_PREFIX_FIELD = 1
const val SHOW_FIRST_NAME_FIELD = 2
const val SHOW_MIDDLE_NAME_FIELD = 4
const val SHOW_SURNAME_FIELD = 8
const val SHOW_SUFFIX_FIELD = 16
const val SHOW_PHONE_NUMBERS_FIELD = 32
const val SHOW_EMAILS_FIELD = 64
const val SHOW_ADDRESSES_FIELD = 128
const val SHOW_EVENTS_FIELD = 256
const val SHOW_NOTES_FIELD = 512
const val SHOW_ORGANIZATION_FIELD = 1024
const val SHOW_GROUPS_FIELD = 2048
const val SHOW_CONTACT_SOURCE_FIELD = 4096
const val SHOW_WEBSITES_FIELD = 8192
const val SHOW_NICKNAME_FIELD = 16384
const val SHOW_IMS_FIELD = 32768
const val SHOW_RINGTONE_FIELD = 65536
const val SHOW_STRUCTURED_ADDRESSES_FIELD = 131072

const val DEFAULT_EMAIL_TYPE = CommonDataKinds.Email.TYPE_HOME
const val DEFAULT_PHONE_NUMBER_TYPE = CommonDataKinds.Phone.TYPE_MOBILE
const val DEFAULT_ADDRESS_TYPE = CommonDataKinds.StructuredPostal.TYPE_HOME
const val DEFAULT_EVENT_TYPE = CommonDataKinds.Event.TYPE_BIRTHDAY
const val DEFAULT_ORGANIZATION_TYPE = CommonDataKinds.Organization.TYPE_WORK
const val DEFAULT_WEBSITE_TYPE = CommonDataKinds.Website.TYPE_HOMEPAGE
const val DEFAULT_IM_TYPE = CommonDataKinds.Im.PROTOCOL_SKYPE
const val DEFAULT_MIMETYPE = CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE

// apps with special handling
const val TELEGRAM_PACKAGE = "org.telegram.messenger"
const val SIGNAL_PACKAGE = "org.thoughtcrime.securesms"
const val WHATSAPP_PACKAGE = "com.whatsapp"
const val VIBER_PACKAGE = "com.viber.voip"
const val THREEMA_PACKAGE = "ch.threema.app"

const val WHATSAPP = "whatsapp"
const val SIGNAL = "signal"
const val VIBER = "viber"
const val TELEGRAM = "telegram"
const val THREEMA = "threema"

const val SOCIAL_VOICE_CALL = 0
const val SOCIAL_VIDEO_CALL = 1
const val SOCIAL_MESSAGE = 2

fun getEmptyLocalContact() = LocalContact(
    0,
    "",
    "",
    "",
    "",
    "",
    "",
    null,
    "",
    ArrayList(),
    ArrayList(),
    ArrayList(),
    0,
    ArrayList(),
    "",
    ArrayList(),
    "",
    "",
    ArrayList(),
    ArrayList(),
    null
)

fun getProperText(text: String, shouldNormalize: Boolean) = if (shouldNormalize) text.normalizeString() else text
