# git-test
git-test

```
erDiagram
Page {
type field_name  "설명"
Long id PK "Page의 id값"
String title "Page의 제목"
String contents "Page의 내용"
Long parrentPageId FK "Page의 부모 Page Id"
Long[] subPageList FK "자식 페이지 리스트"
String[] breadCrumbs " root 부모 순으로 가지는 breadCrumbs"
}
```
