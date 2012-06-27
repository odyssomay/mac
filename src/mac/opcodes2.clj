

{
 ; *********************
 ; LDX                 *
 ; *********************
 0xA2 [:ldx [:immediate]    2 2]
 0xA6 [:ldx [:zero-page]    2 3]
 0xB6 [:ldx [:zero-page :y] 2 4]
 0xAE [:ldx [:absolute]     3 4]
 0xBE [:ldx [:absolute :y]  3 4]

 ; *********************
 ; LDY                 *
 ; *********************
 0xA0 [:ldy [:immediate]    2 2]
 0xA4 [:ldy [:zero-page]    2 3]
 0xB4 [:ldy [:zero-page :x] 2 4]
 0xAC [:ldy [:absolute]     3 4]
 0xBC [:ldy [:absolute :x]  3 4]

 ; *********************
 ; LSR                 *
 ; *********************
 0x4A [:lsr [:accumulator]  1 2]
 0x46 [:lsr [:zero-page]    2 5]
 0x56 [:lsr [:zero-page :x] 2 6]
 0x4E [:lsr [:absolute]     3 6]
 0x5E [:lsr [:absolute :x]  3 7]

 0xEA [:nop [] 1 2]

 ; *********************
 ; ORA                 *
 ; *********************
 0x09 [:ora [:immediate]    2 2]
 0x05 [:ora [:zero-page]    2 2]
 0x15 [:ora [:zero-page :x] 2 3]
 0x0D [:ora [:absolute]     3 4]
 0x1D [:ora [:absolute :x]  3 4]
 0x19 [:ora [:absolute :y]  3 4]
 0x01 [:ora [:indirect :x]  2 6]
 0x11 [:ora [:indirect :y]  2 5]


 ; ***********************
 ; Register Instructions *
 ; ***********************
 0xAA [:tax [] 1 2]
 0x8A [:txa [] 1 2]
 0xCA [:dex [] 1 2]
 0xE8 [:inx [] 1 2]
 0xA8 [:tay [] 1 2]
 0x98 [:tya [] 1 2]
 0x88 [:dey [] 1 2]
 0xC8 [:iny [] 1 2]

 ; *********************
 ; ROL                 *
 ; *********************
 0x2A [:rol [:accumulator]  1 2]
 0x26 [:rol [:zero-page]    2 5]
 0x36 [:rol [:zero-page :x] 2 6]
 0x2E [:rol [:absolute]     3 6]
 0x3E [:rol [:absolute :x]  3 7]

 ; *********************
 ; ROR                 *
 ; *********************
 0x6A [:ror [:accumulator]  1 2]
 0x66 [:ror [:zero-page]    2 5]
 0x76 [:ror [:zero-page :x] 2 6]
 0x6E [:ror [:absolute]     3 6]
 0x7E [:ror [:absolute :x]  3 7]



 0x40 [:rti [] 1 6]
 0x60 [:rtc [] 1 6]

 ; *********************
 ; SBC                 *
 ; *********************
 0xE9 [:sbc [:immediate]    2 2]
 0xE5 [:sbc [:zero-page]    2 3]
 0xF5 [:sbc [:zero-page :x] 2 4]
 0xED [:sbc [:absolute]     3 4]
 0xFD [:sbc [:absolute :x]  3 4]
 0xF9 [:sbc [:absolute :y]  3 4]
 0xE1 [:sbc [:indirect :x]  2 6]
 0xF1 [:sbc [:indirect :y]  2 5]

 ; *********************
 ; STA                 *
 ; *********************
 0x85 [:sta [:zero-page]    2 3]
 0x95 [:sta [:zero-page :x] 2 4]
 0x8D [:sta [:absolute]     3 4]
 0x9D [:sta [:absolute :x]  3 5]
 0x99 [:sta [:absolute :y]  3 5]
 0x81 [:sta [:indirect :x]  2 6]
 0x91 [:sta [:indirect :y]  2 6]

 ; *********************
 ; MISC                *
 ; *********************
 0x9A [:txs [] 1 2]
 0xBA [:tsx [] 1 2]
 0x48 [:pha [] 1 3]
 0x68 [:pla [] 1 4]
 0x08 [:php [] 1 3]
 0x28 [:plp [] 1 4]

 ; *********************
 ; STX                 *
 ; *********************
 0x86 [:stx [:zero-page]    2 3]
 0x96 [:stx [:zero-page :y] 2 4]
 0x8E [:stx [:absolute]     3 4]

 ; *********************
 ; STY                 *
 ; *********************
 0x84 [:sty [:zero-page]    2 3]
 0x94 [:sty [:zero-page :x] 2 4]
 0x8C [:sty [:absolute]     3 4]
 }
