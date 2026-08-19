# LikeMinds Feed: Android social theme example

A deliberately minimal example of theming the LikeMinds Android Feed SDK. The whole customisation is
two files.

**Docs:** https://docs.likeminds.io/

## What this shows

The Android Feed SDK routes every widget through a paired `*ViewStyle` class via
`LMFeedStyleTransformer`, with global appearance set through `LMFeedAppearance`. That means a
complete restyle does not require touching the SDK or subclassing screens.

This repo is the smallest demonstration of that: read it to see where the seams are, then apply the
same pattern with your own values.

For heavier customisations, see the Flutter theme examples
([social-dark](https://github.com/LikeMindsCommunity/likeminds-feed-flutter-social-dark),
[surassa](https://github.com/LikeMindsCommunity/likeminds-feed-flutter-surassa)).

## The SDK itself

[likeminds-feed-android](https://github.com/LikeMindsCommunity/likeminds-feed-android)

## License

Apache 2.0. See [LICENSE](LICENSE).
