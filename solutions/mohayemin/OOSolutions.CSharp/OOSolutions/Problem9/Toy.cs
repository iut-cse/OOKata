namespace OOSolutions.Problem9
{
    // Having a hiererchy of Toys can be temptating
    // But that may be overkill for this problem
    class Toy
    {
        private readonly IWeapon weapon;
        // Other properties go here

        public Toy(IWeapon weapon)
        {
            this.weapon = weapon;
        }

        public string Entertain()
        {
            return weapon.Attack();
        }
    }
}
