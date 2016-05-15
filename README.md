# my-better-files-sample

ScalaのI/Oライブラリ。

https://github.com/pathikrit/better-files

使い方など。

http://takezoe.hatenablog.com/entry/2016/01/27/155542

今回は、tmp/test.txtの中身を読み込んで、tmp/princess_diary.txtに書き込みつつ、拡張子をmdに変換している。

ので、最終的にはtmp/princess_diary.mdが出来上がる。

実行時に既にtmp/princess_diary.md tmp/princess_diary.txtのいずれかがあると、エラーになる。
