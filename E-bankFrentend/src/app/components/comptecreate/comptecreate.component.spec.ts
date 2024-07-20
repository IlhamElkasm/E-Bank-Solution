import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComptecreateComponent } from './comptecreate.component';

describe('ComptecreateComponent', () => {
  let component: ComptecreateComponent;
  let fixture: ComponentFixture<ComptecreateComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ComptecreateComponent]
    });
    fixture = TestBed.createComponent(ComptecreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
