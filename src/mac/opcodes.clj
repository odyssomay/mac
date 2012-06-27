(ns mac.opcodes)

(def opcode->instruction*
{0x69 [:adc [:immediate] 2 2]
 0x65 [:adc [:zero-page] 2 3]
 0x75 [:adc [:zero-page :x] 2 4]
 0x6d [:adc [:absolute] 3 4]
 0x7d [:adc [:absolute :x] 3 4]
 0x79 [:adc [:absolute :y] 3 4]
 0x61 [:adc [:indirect :x] 2 6]
 0x71 [:adc [:indirect :y] 2 5]

 0x29 [:and [:immediate] 2 2]
 0x25 [:and [:zero-page] 2 2]
 0x35 [:and [:zero-page :x] 2 3]
 0x2d [:and [:absolute] 3 4]
 0x3d [:and [:absolute :x] 3 4]
 0x39 [:and [:absolute :y] 3 4]
 0x21 [:and [:indirect :x] 2 6]
 0x31 [:and [:indirect :y] 2 5]

 0x0a [:asl [:accumulator] 1 2]
 0x06 [:asl [:zero-page] 2 5]
 0x16 [:asl [:zero-page :x] 2 6]
 0x0e [:asl [:absolute] 3 6]
 0x1e [:asl [:absolute :x] 3 7]

 0x24 [:bit [:zero-page] 2 3]
 0x2c [:bit [:absolute] 3 4]

 0x10 [:bpl []]
 0x30 [:bmi []]
 0x50 [:bvc []]
 0x70 [:bvs []]
 0x90 [:bcc []]
 0xb0 [:bcs []]
 0xd0 [:bne []]
 0xf0 [:beq []]

 0x00 [:brk [] 1 7]

 0xc9 [:cmp [:immediate] 2 2]
 0xc5 [:cmp [:zero-page] 2 3]
 0xd5 [:cmp [:zero-page :x] 2 4]
 0xcd [:cmp [:absolute] 3 4]
 0xdd [:cmp [:absolute :x]  3 4]
 0xd9 [:cmp [:absolute :y] 3 4]
 0xc1 [:cmp [:indirect :x] 2 6]
 0xd1 [:cmp [:indirect :y] 2 5]

 0xe0 [:cpx [:immediate] 2 2]
 0xe4 [:cpx [:zero-page] 2 3]
 0xec [:cpx [:absolute] 3 4]

 0xc0 [:cpy [:immediate] 2 2]
 0xc4 [:cpy [:zero-page] 2 3]
 0xcc [:cpy [:absolute] 3 4]

 0xc6 [:dec [:zero-page] 2 5]
 0xd6 [:dec [:zero-page :x] 2 6]
 0xce [:dec [:absolute] 3 6]
 0xde [:dec [:absolute :x] 3 7]

 0x49 [:eor [:immediate] 2 2]
 0x45 [:eor [:zero-page] 2 3]
 0x55 [:eor [:zero-page :x] 2 4]
 0x4d [:eor [:absolute] 3 5]
 0x5d [:eor [:absolute :x] 3 4]
 0x59 [:eor [:absolute :y] 3 4]
 0x41 [:eor [:indirect :x] 2 6]
 0x51 [:eor [:indirect :y] 2 5]

 0x18 [:clc []]
 0x38 [:sec []]
 0x58 [:cli []]
 0x78 [:sei []]
 0xb8 [:clv []]
 0xd8 [:cld []]
 0xf8 [:sed []]

 0xe6 [:inc [:zero-page] 2 5]
 0xf6 [:inc [:zero-page :x] 2 6]
 0xee [:inc [:absolute] 3 6]
 0xfe [:inc [:absolute :x] 3 7]

 0x4c [:jmp [:absolute] 3 3]
 0x6c [:jmp [:indirect] 3 5]

 0x20 [:jsr [:absolute] 3 6]

 0xa9 [:lda [:immediate] 2 2]
 0xa5 [:lda [:zero-page] 2 3]
 0xb5 [:lda [:zero-page :x] 2 4]
 0xad [:lda [:absolute] 3 4]
 0xbd [:lda [:absolute :x] 3 4]
 0xb9 [:lda [:absolute :y] 3 4]
 0xa1 [:lda [:indirect :x] 2 6]
 0xb1 [:lda [:indirect :y] 2 5]
 })

(def opcode->instruction
  (for [[opcode [name type length cycles]] opcode->instruction*]
    [opcode {:name name :type type 
             :length length :cycles cycles}]))

(def instruction->opcode
  (into {} (map (comp vec reverse) opcode->instruction)))
 
(defn opcodes []
  )

(defn get-opcode [instruction]
  (let [opcode (filter (fn [[instruction opcode]] ) instruction->opcode)]
    (if-not opcode
      (println "WARNING: Instruction" instruction "not found!"))
    opcode))

(defn get-instruction [opcode]
  (let [instruction (get opcode->instruction opcode nil)]
    (if-not instruction
      (println "WARNING: Opcode" opcode "not found !!!11"))
    instruction))
