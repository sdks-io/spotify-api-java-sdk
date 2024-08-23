
# Device Object

## Structure

`DeviceObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The device ID. This ID is unique and persistent to some extent. However, this is not guaranteed and any cached `device_id` should periodically be cleared out and refetched as necessary. | String getId() | setId(String id) |
| `IsActive` | `Boolean` | Optional | If this device is the currently active device. | Boolean getIsActive() | setIsActive(Boolean isActive) |
| `IsPrivateSession` | `Boolean` | Optional | If this device is currently in a private session. | Boolean getIsPrivateSession() | setIsPrivateSession(Boolean isPrivateSession) |
| `IsRestricted` | `Boolean` | Optional | Whether controlling this device is restricted. At present if this is "true" then no Web API commands will be accepted by this device. | Boolean getIsRestricted() | setIsRestricted(Boolean isRestricted) |
| `Name` | `String` | Optional | A human-readable name for the device. Some devices have a name that the user can configure (e.g. \"Loudest speaker\") and some devices have a generic name associated with the manufacturer or device model. | String getName() | setName(String name) |
| `Type` | `String` | Optional | Device type, such as "computer", "smartphone" or "speaker". | String getType() | setType(String type) |
| `VolumePercent` | `Integer` | Optional | The current volume in percent.<br>**Constraints**: `>= 0`, `<= 100` | Integer getVolumePercent() | setVolumePercent(Integer volumePercent) |
| `SupportsVolume` | `Boolean` | Optional | If this device can be used to set the volume. | Boolean getSupportsVolume() | setSupportsVolume(Boolean supportsVolume) |

## Example (as JSON)

```json
{
  "name": "Kitchen speaker",
  "type": "computer",
  "volume_percent": 59,
  "id": "id4",
  "is_active": false,
  "is_private_session": false,
  "is_restricted": false
}
```

