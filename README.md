# Ubungen_1_Grafikprogrammierung

## 1. Vor- und Nachteile von Rastergrafiken
Die meisten Displays und Drucker stellen heute einzelne Pixel dar, die in einem Raster angeordnet sind, genau wie das Format von Rastergrafiken.

Rastergrafiken haben für jedes Pixel einen Farbwert. Daher ist es vollständig durch die Anzahl der Pixel in x- und y-Richtung und ein Datenfeld mit Farbwerten definiert.

Es ist eine gute Möglichkeit, Grafiken mit vielen Details und Variationen zu speichern.

Nachteile:
Rastergrafiken sind beim Vergrößern verschwommen: Der größte Nachteil von Rasterbildern besteht darin, dass sie beim Vergrößern körnig oder gezackt werden. Im Grunde ist es ein endliches Quadrat und wenn Sie es vergrößern, beginnen Sie dieses Quadrat zu sehen.

Rastergrafiken können zu großen Dateigrößen führen.


## 2. Wie groß ist der Speicherbedarf einer Rastergrafik mit 1000 x 1000 Pixeln bei einer Bittiefe von 8 Bit pro Farbkanal und RGBA-Farbwerten?
Anzahl Pixel in der Breite * Anzahl Pixel in der Höhe = Pixelanzahl
1000px * 1000 px = 1 000 000px

Pixelanzahl * Bittiefe = Bilddateigröße
1 000 000px * 8bits/pixel = 8 000 000 bits

Bits zu byte:
8 000 000 / 8 = 1 000 000 bytes = 1 MB

1 MB.


## 3. Gegeben sei folgende SVG Vektorgrafik:
     <svg viewBox="0 0 400 210" xmlns="http://www.w3.org/2000/svg">
       <path d="M150 0 L75 200 L225 200 Z" />
      </svg>
Was wird dargestellt?

Ich habe das SVG in einem SVG-Leseprogramm geöffnet und ein Dreieck gesehen.

