fn xmas() {
    let numbers = [
        "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
        "tenth", "eleventh", "twelfth",
    ];
    let itemlist = [
        "three pigs",
        "two bears",
        "one potato",
        "five pizze",
        "four birds",
        "eleven beds",
        "two balls",
        "one kangaroo",
        "elven parrots",
        "five pitchforks",
        "one cabbage",
        "one carrot",
    ];
    for (idx, text) in numbers.iter().enumerate() {
        println!("On the {} day of Christmas, Rust gave to me: {}",
                 text,
                 itemlist[..idx+1].join(", "));
    }
}

fn main() {
    xmas();
}
