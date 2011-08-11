// ----------------------------------------------------------------------------
// Copyright 2006-2008, Martin D. Flynn
// All rights reserved
// ----------------------------------------------------------------------------
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// ----------------------------------------------------------------------------
// Description:
//  OpenDMTP protocol status code constants.
// ----------------------------------------------------------------------------
// Change History:
//  2006/03/26  Martin D. Flynn
//     -Initial release
//  2006/03/31  Martin D. Flynn
//     -Added new status codes: STATUS_INITIALIZED, STATUS_WAYMARK
//  2006/11/03  Robert Puckett
//     -Include JavaDocs
//  2007/04/22  Martin D. Flynn
//     -Added new status codes: STATUS_QUERY, STATUS_LOW_BATTERY
//     -Added new status codes: STATUS_POWER_FAILURE
// ----------------------------------------------------------------------------
package com.tommasocodella.androdmtp.opendmtp.codes;

/**
* Contains OpenDMTP protocol status code constants. <br>
* ---------------------------------------------------------------------------- <br>
* Reserved status codes: [E0-00 through FF-FF] <br>
* Groups: <br>
* 0xF0.. - Generic <br>
* 0xF1.. - Motion <br>
* 0xF2.. - Geofence <br>
* 0xF4.. - Digital input/output <br>
* 0xF6.. - Sensor input <br>
* 0xF7.. - Temperature input <br>
* 0xF9.. - J1708 <br>
*/
public interface StatusCodes
{

// ----------------------------------------------------------------------------
// Reserved status codes: [E0-00 through FF-FF]
// Groups:
//      0xF0..  - Generic
//      0xF1..  - Motion
//      0xF2..  - Geofence
//      0xF4..  - Digital input/output
//      0xF6..  - Sensor input
//      0xF7..  - Temperature input
//      0xF9..  - J1708
//      0xFD..  - Device status
// ----------------------------------------------------------------------------

// ----------------------------------------------------------------------------
// No status code: 0x0000

    public static final int STATUS_NONE                 = 0x0000;

// ----------------------------------------------------------------------------
// Generic codes: 0xF000 to 0xF0FF

    public static final int STATUS_INITIALIZED          = 0xF010;
    // Description:
    //      General Status/Location information (event generated by some
    //      initialization function performed by the device).
    // Notes:
    //      - This contents of the payload must at least contain the current
    //      timestamp (and latitude and longitude if available).

    public static final int STATUS_LOCATION             = 0xF020;
    // Description:
    //      General Status/Location information.  This status code indicates
    //      no more than just the location of the device at a particular time.
    // Notes:
    //      - This contents of the payload must at least contain the current
    //      timestamp, latitude, and longitude.

    public static final int STATUS_WAYMARK              = 0xF030;
    // Description:
    //      General Status/Location information (event generated by manual user
    //      intervention at the device. ie. By pressing a 'Waymark' button).
    // Notes:
    //      - This contents of the payload must at least contain the current
    //      timestamp, latitude, and longitude.

    public static final int STATUS_QUERY                = 0xF040;
    // Description:
    //      General Status/Location information (event generated by 'query'
    //      from the server).
    // Notes:
    //      - This contents of the payload must at least contain the current
    //      timestamp, latitude, and longitude.

// ----------------------------------------------------------------------------
// Motion codes: 0xF100 to 0xF1FF

    public static final int STATUS_MOTION_START         = 0xF111;
    // Description:
    //      Device start of motion
    // Notes:
    //      The definition of motion-start is provided by property PROP_MOTION_START

    public static final int STATUS_MOTION_IN_MOTION     = 0xF112;
    // Description:
    //      Device in-motion interval
    // Notes:
    //      The in-motion interval is provided by property PROP_MOTION_IN_MOTION.
    //      This status is typically used for providing in-motion events between
    //      STATUS_MOTION_START and STATUS_MOTION_STOP events.

    public static final int STATUS_MOTION_STOP          = 0xF113;
    // Description:
    //      Device stopped motion
    // Notes:
    //      The definition of motion-stop is provided by property PROP_MOTION_STOP

    public static final int STATUS_MOTION_DORMANT       = 0xF114;
    // Description:
    //      Device dormant interval (ie. not moving)
    // Notes:
    //      The dormant interval is provided by property PROP_MOTION_DORMANT

    public static final int STATUS_MOTION_EXCESS_SPEED  = 0xF11A;
    // Description:
    //      Device exceeded preset speed limit
    // Notes:
    //      The excess-speed threshold is provided by property PROP_MOTION_EXCESS_SPEED

    public static final int STATUS_MOTION_MOVING        = 0xF11C;
    // Description:
    //      Device is moving
    // Notes:
    //      This status code may be used to indicating that the device was moving
    //      at the time the event was generated.  It is not typically associated
    //      with the status codes STATUS_MOTION_START, STATUS_MOTION_STOP, and  
    //      STATUS_MOTION_IN_MOTION, and may be used independently of these codes.

    public static final int STATUS_ODOM_0               = 0xF130;
    public static final int STATUS_ODOM_1               = 0xF131;
    public static final int STATUS_ODOM_2               = 0xF132;
    public static final int STATUS_ODOM_3               = 0xF133;
    public static final int STATUS_ODOM_4               = 0xF134;
    public static final int STATUS_ODOM_5               = 0xF135;
    public static final int STATUS_ODOM_6               = 0xF136;
    public static final int STATUS_ODOM_7               = 0xF137;
    // Description:
    //      Odometer value
    // Notes:
    //      The odometer limit is provided by property PROP_ODOMETER_#_LIMIT

    public static final int STATUS_ODOM_LIMIT_0         = 0xF140;
    public static final int STATUS_ODOM_LIMIT_1         = 0xF141;
    public static final int STATUS_ODOM_LIMIT_2         = 0xF142;
    public static final int STATUS_ODOM_LIMIT_3         = 0xF143;
    public static final int STATUS_ODOM_LIMIT_4         = 0xF144;
    public static final int STATUS_ODOM_LIMIT_5         = 0xF145;
    public static final int STATUS_ODOM_LIMIT_6         = 0xF146;
    public static final int STATUS_ODOM_LIMIT_7         = 0xF147;
    // Description:
    //      Odometer has exceeded a set limit
    // Notes:
    //      The odometer limit is provided by property PROP_ODOMETER_#_LIMIT

// ----------------------------------------------------------------------------
// Geofence: 0xF200 to 0xF2FF

    public static final int STATUS_GEOFENCE_ARRIVE      = 0xF210;
    // Description:
    //      Device arrived at geofence
    // Notes:
    //      - Client may wish to include FIELD_GEOFENCE_ID in the event packet.

    public static final int STATUS_GEOFENCE_DEPART      = 0xF230;
    // Description:
    //      Device departed geofence
    // Notes:
    //      - Client may wish to include FIELD_GEOFENCE_ID in the event packet.

    public static final int STATUS_GEOFENCE_VIOLATION   = 0xF250;
    // Description:
    //      Geofence violation
    // Notes:
    //      - Client may wish to include FIELD_GEOFENCE_ID in the event packet.

    public static final int STATUS_GEOFENCE_ACTIVE      = 0xF270;
    // Description:
    //      Geofence now active
    // Notes:
    //      - Client may wish to include FIELD_GEOFENCE_ID in the event packet.

    public static final int STATUS_GEOFENCE_INACTIVE    = 0xF280;
    // Description:
    //      Geofence now inactive
    // Notes:
    //      - Client may wish to include FIELD_GEOFENCE_ID in the event packet.

// ----------------------------------------------------------------------------
// Digital input/output (state change): 0xF400 to 0xF4FF

    public static final int STATUS_INPUT_STATE          = 0xF400;
    // Description:
    //      Current input ON state (bitmask)
    // Notes:
    //      - Client should include FIELD_INPUT_STATE in the event packet,
    //      otherwise this status code would have no meaning.

    public static final int STATUS_INPUT_ON             = 0xF402;
    // Description:
    //      Input turned ON
    // Notes:
    //      - Client should include FIELD_INPUT_ID in the event packet,
    //      otherwise this status code would have no meaning.
    //      - This status code may be used to indicate that an arbitrary input
    //      'thing' turned ON, and the 'thing' can be identified by the 'Input ID'.
    //      This 'ID' can also represent the index of a digital input.

    public static final int STATUS_INPUT_OFF            = 0xF404;
    // Description:
    //      Input turned OFF
    // Notes:
    //      - Client should include FIELD_INPUT_ID in the event packet,
    //      otherwise this status code would have no meaning.
    //      - This status code may be used to indicate that an arbitrary input
    //      'thing' turned OFF, and the 'thing' can be identified by the 'Input ID'.
    //      This 'ID' can also represent the index of a digital input.

    public static final int STATUS_OUTPUT_STATE         = 0xF406;
    // Description:
    //      Current output ON state (bitmask)
    // Notes:
    //      - Client should include FIELD_OUTPUT_STATE in the event packet,
    //      otherwise this status code would have no meaning.

    public static final int STATUS_OUTPUT_ON            = 0xF408;
    // Description:
    //      Output turned ON
    // Notes:
    //      - Client should include FIELD_OUTPUT_ID in the event packet,
    //      otherwise this status code would have no meaning.
    //      - This status code may be used to indicate that an arbitrary output
    //      'thing' turned ON, and the 'thing' can be identified by the 'Output ID'.
    //      This 'ID' can also represent the index of a digital output.

    public static final int STATUS_OUTPUT_OFF           = 0xF40A;
    // Description:
    //      Output turned OFF
    // Notes:
    //      - Client should include FIELD_OUTPUT_ID in the event packet,
    //      otherwise this status code would have no meaning.
    //      - This status code may be used to indicate that an arbitrary output
    //      'thing' turned OFF, and the 'thing' can be identified by the 'Output ID'.
    //      This 'ID' can also represent the index of a digital output.

    public static final int STATUS_INPUT_ON_00          = 0xF420;
    public static final int STATUS_INPUT_ON_01          = 0xF421;
    public static final int STATUS_INPUT_ON_02          = 0xF422;
    public static final int STATUS_INPUT_ON_03          = 0xF423;
    public static final int STATUS_INPUT_ON_04          = 0xF424;
    public static final int STATUS_INPUT_ON_05          = 0xF425;
    public static final int STATUS_INPUT_ON_06          = 0xF426;
    public static final int STATUS_INPUT_ON_07          = 0xF427;
    // Description:
    //      Digital input state changed to ON

    public static final int STATUS_INPUT_OFF_00         = 0xF440;
    public static final int STATUS_INPUT_OFF_01         = 0xF441;
    public static final int STATUS_INPUT_OFF_02         = 0xF442;
    public static final int STATUS_INPUT_OFF_03         = 0xF443;
    public static final int STATUS_INPUT_OFF_04         = 0xF444;
    public static final int STATUS_INPUT_OFF_05         = 0xF445;
    public static final int STATUS_INPUT_OFF_06         = 0xF446;
    public static final int STATUS_INPUT_OFF_07         = 0xF447;
    // Description:
    //      Digital input state changed to OFF

    public static final int STATUS_OUTPUT_ON_00         = 0xF460;
    public static final int STATUS_OUTPUT_ON_01         = 0xF461;
    public static final int STATUS_OUTPUT_ON_02         = 0xF462;
    public static final int STATUS_OUTPUT_ON_03         = 0xF463;
    public static final int STATUS_OUTPUT_ON_04         = 0xF464;
    public static final int STATUS_OUTPUT_ON_05         = 0xF465;
    public static final int STATUS_OUTPUT_ON_06         = 0xF466;
    public static final int STATUS_OUTPUT_ON_07         = 0xF467;
    // Description:
    //      Digital output state set to ON

    public static final int STATUS_OUTPUT_OFF_00        = 0xF480;
    public static final int STATUS_OUTPUT_OFF_01        = 0xF481;
    public static final int STATUS_OUTPUT_OFF_02        = 0xF482;
    public static final int STATUS_OUTPUT_OFF_03        = 0xF483;
    public static final int STATUS_OUTPUT_OFF_04        = 0xF484;
    public static final int STATUS_OUTPUT_OFF_05        = 0xF485;
    public static final int STATUS_OUTPUT_OFF_06        = 0xF486;
    public static final int STATUS_OUTPUT_OFF_07        = 0xF487;
    // Description:
    //      Digital output state set to OFF

    public static final int STATUS_ELAPSED_00           = 0xF4A0;
    public static final int STATUS_ELAPSED_01           = 0xF4A1;
    public static final int STATUS_ELAPSED_02           = 0xF4A2;
    public static final int STATUS_ELAPSED_03           = 0xF4A3;
    public static final int STATUS_ELAPSED_04           = 0xF4A4;
    public static final int STATUS_ELAPSED_05           = 0xF4A5;
    public static final int STATUS_ELAPSED_06           = 0xF4A6;
    public static final int STATUS_ELAPSED_07           = 0xF4A7;
    // Description:
    //      Elapsed time
    // Notes:
    //      - Client should include FIELD_ELAPSED_TIME in the event packet,
    //      otherwise this status code would have no meaning.

    public static final int STATUS_ELAPSED_LIMIT_00     = 0xF4B0;
    public static final int STATUS_ELAPSED_LIMIT_01     = 0xF4B1;
    public static final int STATUS_ELAPSED_LIMIT_02     = 0xF4B2;
    public static final int STATUS_ELAPSED_LIMIT_03     = 0xF4B3;
    public static final int STATUS_ELAPSED_LIMIT_04     = 0xF4B4;
    public static final int STATUS_ELAPSED_LIMIT_05     = 0xF4B5;
    public static final int STATUS_ELAPSED_LIMIT_06     = 0xF4B6;
    public static final int STATUS_ELAPSED_LIMIT_07     = 0xF4B7;
    // Description:
    //      Elapsed timer has exceeded a set limit
    // Notes:
    //      - Client should include FIELD_ELAPSED_TIME in the event packet,
    //      otherwise this status code would have no meaning.

// ----------------------------------------------------------------------------
// Analog/etc sensor values (extra data): 0xF600 to 0xF6FF

    public static final int STATUS_SENSOR32_0           = 0xF600;
    public static final int STATUS_SENSOR32_1           = 0xF601;
    public static final int STATUS_SENSOR32_2           = 0xF602;
    public static final int STATUS_SENSOR32_3           = 0xF603;
    public static final int STATUS_SENSOR32_4           = 0xF604;
    public static final int STATUS_SENSOR32_5           = 0xF605;
    public static final int STATUS_SENSOR32_6           = 0xF606;
    public static final int STATUS_SENSOR32_7           = 0xF607;
    // Description:
    //      32-bit unsigned sensor value
    // Notes:
    //      - Client should include FIELD_SENSOR32 in the event packet,
    //      otherwise this status code would have no meaning.
    //      - The server must be able to convert this 32-bit value to something
    //      meaningful to the user.  This can be done using the following formula:
    //         Actual_Value = ((double)Sensor32_Value * <Gain>) + <Offset>;
    //      Where <Gain> & <Offset> are user configurable values provided at setup.
    //      For instance: Assume Sensor32-0 contains a temperature value that can
    //      have a range of -40.0C to +125.0C.  The client would encode -14.7C
    //      by adding 40.0 and multiplying by 10.0.  The resulting value would be
    //      253.  The server would then be configured to know how to convert this
    //      value back into the proper temperature using the above formula by
    //      substituting 0.1 for <Gain>, and -40.0 for <Offset>: eg.
    //          -14.7 = ((double)253 * 0.1) + (-40.0);

    public static final int STATUS_SENSOR32_RANGE_0     = 0xF620;
    public static final int STATUS_SENSOR32_RANGE_1     = 0xF621;
    public static final int STATUS_SENSOR32_RANGE_2     = 0xF622;
    public static final int STATUS_SENSOR32_RANGE_3     = 0xF623;
    public static final int STATUS_SENSOR32_RANGE_4     = 0xF624;
    public static final int STATUS_SENSOR32_RANGE_5     = 0xF625;
    public static final int STATUS_SENSOR32_RANGE_6     = 0xF626;
    public static final int STATUS_SENSOR32_RANGE_7     = 0xF627;
    // Description:
    //      32-bit unsigned sensor value out-of-range violation
    // Notes:
    //      - Client should include FIELD_SENSOR32 in the event packet,
    //      otherwise this status code would have no meaning.

// ----------------------------------------------------------------------------
// Temperature sensor values (extra data): 0xF700 to 0xF7FF

    public static final int STATUS_TEMPERATURE_0        = 0xF710;
    public static final int STATUS_TEMPERATURE_1        = 0xF711;
    public static final int STATUS_TEMPERATURE_2        = 0xF712;
    public static final int STATUS_TEMPERATURE_3        = 0xF713;
    public static final int STATUS_TEMPERATURE_4        = 0xF714;
    public static final int STATUS_TEMPERATURE_5        = 0xF715;
    public static final int STATUS_TEMPERATURE_6        = 0xF716;
    public static final int STATUS_TEMPERATURE_7        = 0xF717;
    // Description:
    //      Temperature value
    // Notes:
    //      - Client should include at least the field FIELD_TEMP_AVER in the 
    //      event packet, and may also wish to include FIELD_TEMP_LOW and
    //      FIELD_TEMP_HIGH.

    public static final int STATUS_TEMPERATURE_RANGE_0  = 0xF730;
    public static final int STATUS_TEMPERATURE_RANGE_1  = 0xF731;
    public static final int STATUS_TEMPERATURE_RANGE_2  = 0xF732;
    public static final int STATUS_TEMPERATURE_RANGE_3  = 0xF733;
    public static final int STATUS_TEMPERATURE_RANGE_4  = 0xF734;
    public static final int STATUS_TEMPERATURE_RANGE_5  = 0xF735;
    public static final int STATUS_TEMPERATURE_RANGE_6  = 0xF736;
    public static final int STATUS_TEMPERATURE_RANGE_7  = 0xF737;
    // Description:
    //      Temperature value out-of-range [low/high/average]
    // Notes:
    //      - Client should include at least one of the fields FIELD_TEMP_AVER,
    //      FIELD_TEMP_LOW, or FIELD_TEMP_HIGH.

    public static final int STATUS_TEMPERATURE          = 0xF7F1;
    // Description:
    //      All temperature averages [aver/aver/aver/...]

// ----------------------------------------------------------------------------
// Miscellaneous

    public static final int STATUS_LOGIN                = 0xF811;
    // Description:
    //      Generic 'login'

    public static final int STATUS_LOGOUT               = 0xF812;
    // Description:
    //      Generic 'logout'

    public static final int STATUS_CONNECT              = 0xF821;
    // Description:
    //      Connect/Hook/On

    public static final int STATUS_DISCONNECT           = 0xF822;
    // Description:
    //      Disconnect/Drop/Off

    public static final int STATUS_ACK                  = 0xF831;
    // Description:
    //      Acknowledge

    public static final int STATUS_NAK                  = 0xF832;
    // Description:
    //      Negative Acknowledge

// ----------------------------------------------------------------------------
// Internal device status

    public static final int STATUS_LOW_BATTERY          = 0xFD10;
    // Description:
    //      Low battery indicator

    public static final int STATUS_POWER_FAILURE        = 0xFD13;
    // Description:
    //      Power failure indicator

// ----------------------------------------------------------------------------
 
}

