getElement().executeJs("return 'adoptedStyleSheets' in document")
  .then(Boolean.class, supported -> {
    if (supported) {
      System.out.println("Feature is supported");
    } else {
      System.out.println("Feature is not supported");
    }
});
