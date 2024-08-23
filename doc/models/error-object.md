
# Error Object

## Structure

`ErrorObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `int` | Required | The HTTP status code (also returned in the response header; see [Response Status Codes](/documentation/web-api/concepts/api-calls#response-status-codes) for more information).<br>**Constraints**: `>= 400`, `<= 599` | int getStatus() | setStatus(int status) |
| `Message` | `String` | Required | A short description of the cause of the error. | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "status": 166,
  "message": "message8"
}
```

