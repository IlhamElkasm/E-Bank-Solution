import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CempteComponent } from './cempte.component';

describe('CempteComponent', () => {
  let component: CempteComponent;
  let fixture: ComponentFixture<CempteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CempteComponent]
    });
    fixture = TestBed.createComponent(CempteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
