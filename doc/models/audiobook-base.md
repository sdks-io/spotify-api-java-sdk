
# Audiobook Base

## Structure

`AudiobookBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Authors` | [`List<AuthorObject>`](../../doc/models/author-object.md) | Required | The author(s) for the audiobook. | List<AuthorObject> getAuthors() | setAuthors(List<AuthorObject> authors) |
| `AvailableMarkets` | `List<String>` | Required | A list of the countries in which the audiobook can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. | List<String> getAvailableMarkets() | setAvailableMarkets(List<String> availableMarkets) |
| `Copyrights` | [`List<CopyrightObject>`](../../doc/models/copyright-object.md) | Required | The copyright statements of the audiobook. | List<CopyrightObject> getCopyrights() | setCopyrights(List<CopyrightObject> copyrights) |
| `Description` | `String` | Required | A description of the audiobook. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. | String getDescription() | setDescription(String description) |
| `HtmlDescription` | `String` | Required | A description of the audiobook. This field may contain HTML tags. | String getHtmlDescription() | setHtmlDescription(String htmlDescription) |
| `Edition` | `String` | Optional | The edition of the audiobook. | String getEdition() | setEdition(String edition) |
| `Explicit` | `boolean` | Required | Whether or not the audiobook has explicit content (true = yes it does; false = no it does not OR unknown). | boolean getExplicit() | setExplicit(boolean explicit) |
| `ExternalUrls` | [`ExternalUrlObject`](../../doc/models/external-url-object.md) | Required | External URLs for this audiobook. | ExternalUrlObject getExternalUrls() | setExternalUrls(ExternalUrlObject externalUrls) |
| `Href` | `String` | Required | A link to the Web API endpoint providing full details of the audiobook. | String getHref() | setHref(String href) |
| `Id` | `String` | Required | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. | String getId() | setId(String id) |
| `Images` | [`List<ImageObject>`](../../doc/models/image-object.md) | Required | The cover art for the audiobook in various sizes, widest first. | List<ImageObject> getImages() | setImages(List<ImageObject> images) |
| `Languages` | `List<String>` | Required | A list of the languages used in the audiobook, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. | List<String> getLanguages() | setLanguages(List<String> languages) |
| `MediaType` | `String` | Required | The media type of the audiobook. | String getMediaType() | setMediaType(String mediaType) |
| `Name` | `String` | Required | The name of the audiobook. | String getName() | setName(String name) |
| `Narrators` | [`List<NarratorObject>`](../../doc/models/narrator-object.md) | Required | The narrator(s) for the audiobook. | List<NarratorObject> getNarrators() | setNarrators(List<NarratorObject> narrators) |
| `Publisher` | `String` | Required | The publisher of the audiobook. | String getPublisher() | setPublisher(String publisher) |
| `Type` | [`Type9Enum`](../../doc/models/type-9-enum.md) | Required | The object type. | Type9Enum getType() | setType(Type9Enum type) |
| `Uri` | `String` | Required | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. | String getUri() | setUri(String uri) |
| `TotalChapters` | `int` | Required | The number of chapters in this audiobook. | int getTotalChapters() | setTotalChapters(int totalChapters) |

## Example (as JSON)

```json
{
  "authors": [
    {
      "name": "name0"
    }
  ],
  "available_markets": [
    "available_markets8",
    "available_markets9",
    "available_markets0"
  ],
  "copyrights": [
    {
      "text": "text2",
      "type": "type2"
    }
  ],
  "description": "description4",
  "html_description": "html_description4",
  "edition": "Unabridged",
  "explicit": false,
  "external_urls": {
    "spotify": "spotify6"
  },
  "href": "href6",
  "id": "id4",
  "images": [
    {
      "url": "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n",
      "height": 300,
      "width": 300
    }
  ],
  "languages": [
    "languages1",
    "languages2",
    "languages3"
  ],
  "media_type": "media_type2",
  "name": "name4",
  "narrators": [
    {
      "name": "name0"
    }
  ],
  "publisher": "publisher2",
  "type": "audiobook",
  "uri": "uri8",
  "total_chapters": 240
}
```

