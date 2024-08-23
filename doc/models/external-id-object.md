
# External Id Object

## Structure

`ExternalIdObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Isrc` | `String` | Optional | [International Standard Recording Code](http://en.wikipedia.org/wiki/International_Standard_Recording_Code) | String getIsrc() | setIsrc(String isrc) |
| `Ean` | `String` | Optional | [International Article Number](http://en.wikipedia.org/wiki/International_Article_Number_%28EAN%29) | String getEan() | setEan(String ean) |
| `Upc` | `String` | Optional | [Universal Product Code](http://en.wikipedia.org/wiki/Universal_Product_Code) | String getUpc() | setUpc(String upc) |

## Example (as JSON)

```json
{
  "isrc": "isrc2",
  "ean": "ean4",
  "upc": "upc8"
}
```

